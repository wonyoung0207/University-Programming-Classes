using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace PointIndexer
{
    public partial class MainForm : Form
    {
        PointArray parr = null;
        Point p = null;

        public MainForm()
        {
            InitializeComponent();
        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            int x, y;

            x = int.Parse(txtX.Text);
            y = int.Parse(txtY.Text);

            parr = new PointArray();
            p = new Point(x, y);
            parr[PointArray.count] = p;
            
            
        }

        private void button2_Click(object sender, EventArgs e)
        {
            txtResult.Text += parr[PointArray.count - 1].ToString();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            //델리게이트는 특정 메소드를 대신 호출시켜주기 위해 사용된다. 
            //p 객체에 있는 moveBy메소드를 위임해준다. 
            //델리게이트는 하나만 위임해줄수 있다. 하지만 누적시켜서 위임가능 
            MyDelegate myd = new MyDelegate(p.MoveBy);
            //델리게이트에다가 값을 전달하면 델리게이트에서 위임받은 메소드 moveby가 실행됨
            myd(int.Parse(txtX.Text), int.Parse(txtY.Text));
            myd += new MyDelegate(p.MoveTo);

            txtResult.Text = p.ToString();

        }
    }
}
