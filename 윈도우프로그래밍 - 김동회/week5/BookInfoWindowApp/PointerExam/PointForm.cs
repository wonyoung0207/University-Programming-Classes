using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace PointerExam
{
    public partial class PointForm : Form
    {
        PointArray parr = null;
        Point p = null;
        public PointForm()
        {
            InitializeComponent();
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void btnPrint_Click(object sender, EventArgs e)
        {
            int x, y;

            x = Convert.ToInt32(txtX.Text);
            y = int.Parse(txtY.Text);

            p = new Point(x,y);

            txtResult.Text = p.ToString();

            //10개의 포인터를 가질 수 있는 객체가 된다. = 인덱서
            parr = new PointArray();
            parr[0] = p;//인덱서 0번째에 포인터 p 객체를 넣어준다. 

            //가져온 p 객체의 toString 을 호출
            txtResult.Text += "\n인덱서 이용한 출력 : " + parr[0].ToString();

        }

        private void btnMoveTo_Click(object sender, EventArgs e)
        {
            int x, y;

            x = int.Parse(txtX.Text);
            y = int.Parse(txtY.Text);

            p.MoveTo(x, y);

            txtResult.Text = p.ToString();
        }

        private void btnPlus_Click(object sender, EventArgs e)
        {
            Point p1 = new Point(int.Parse(txtX.Text), int.Parse(txtY.Text));
            Point p2 = new Point(int.Parse(txtX2.Text), int.Parse(txtY2.Text));

            //Point p3 = p1.Add(p2) + p2.Add(p1);//원래는 더하기 하려면 이렇게 해야함
            //연산자 재정의(operator) 로 인해 '+' 가 재정의 되어 객체의 값들을 더해서 출력해준다. 
            Point p3 = p1 + p2;

            txtResult.Text = p3.ToString();

        }

        private void btnMoveBy_Click(object sender, EventArgs e)//델리게이트 
        {
            //델리게이트는 특정 메소드를 대신 호출시켜주기 위해 사용된다. 
            //p 객체에 있는 moveBy메소드를 위임해준다. 
            //델리게이트는 하나만 위임해줄수 있다. 하지만 누적시켜서 위임가능 
            MyDelegate myd = new MyDelegate(p.MoveBy);
            //델리게이트에다가 값을 전달하면 델리게이트에서 위임받은 메소드 moveby가 실행됨
            myd(int.Parse(txtX.Text), int.Parse(txtY.Text));
            myd += new MyDelegate(p.MoveTo);
            myd -= new MyDelegate(p.MoveTo);

            txtResult.Text = p.ToString();

/*
            myd = new MyDelegate(p.MoveTo);//위임을 moveto로 변경 
            myd(int.Parse(txtX.Text), int.Parse(txtY.Text));*/

        }
    }
}
