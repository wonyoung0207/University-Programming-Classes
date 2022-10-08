using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace PointExam
{
    public partial class PointForm : Form
    {
        Point p = null;
        public PointForm()
        {
            InitializeComponent();
        }

        private void btnCreat_Click(object sender, EventArgs e)
        {
            int x, y;
            x = int.Parse(txtX.Text);
            y = int.Parse(txtY.Text);

            //다른 메소드에서 사용하려면 전역변수로 선언해야함
            p = new Point(x, y);
            txtPrint.Text = p.ToString();

        }

        private void btnChange_Click(object sender, EventArgs e)
        {
            p.MoveTo(int.Parse(txtX.Text), int.Parse(txtY.Text));
            txtPrint.Text = p.ToString();
        }

        private void btngo_Click(object sender, EventArgs e)
        {
            p.MoveBy(int.Parse(txtX.Text), int.Parse(txtY.Text));
            txtPrint.Text = p.ToString();
        }
        //같은 네임스페이스 안에 클래스 만들어야 함. 
        /*public class Point
        {

        }*/
    }
}
