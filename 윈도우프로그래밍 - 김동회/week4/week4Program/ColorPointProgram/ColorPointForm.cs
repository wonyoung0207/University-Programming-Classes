using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ColorPointProgram
{
    public partial class ColorPointForm : Form
    {
        Colorable3DPoint c3p = null;
        public ColorPointForm()
        {
            InitializeComponent();
        }

        private void ColorPointForm_Load(object sender, EventArgs e)
        {

        }

        private void button5_Click(object sender, EventArgs e)
        {
            int x, y, z;
            string c;

            x = int.Parse(txtX.Text);
            y = Convert.ToInt32(txtY.Text);
            z = Convert.ToInt32(txtZ.Text);
            c = txtC.Text;

            c3p = new Colorable3DPoint(x,y,z,c);

            txtXp.Text = Convert.ToString(c3p.GetX());
            //getX는 정수를 리턴하기 때문에 문자열로 변환해서 텍스트 박스에 넣어야 한다. 
            txtYp.Text = c3p.GetY() + "";
            txtZp.Text = c3p.GetZ().ToString();
            txtCp.Text = c3p.GetColor();

        }

        private void btnChange_Click(object sender, EventArgs e)
        {
            int x, y, z;

            x = int.Parse(txtX.Text);
            y = Convert.ToInt32(txtY.Text);
            z = Convert.ToInt32(txtZ.Text);

            c3p.MoveTo(x, y, z);

            print3DPoint();//출력해주는 메소드 하나 만들어놓으면 편리함 


        }

        private void print3DPoint()
        {
            txtXp.Text = Convert.ToString(c3p.GetX());
            //getX는 정수를 리턴하기 때문에 문자열로 변환해서 텍스트 박스에 넣어야 한다. 
            txtYp.Text = c3p.GetY() + "";
            txtZp.Text = c3p.GetZ().ToString();
            txtCp.Text = c3p.GetColor();
        }

        private void btnMove_Click(object sender, EventArgs e)
        {
            int x, y, z;

            x = int.Parse(txtX.Text);
            y = Convert.ToInt32(txtY.Text);
            z = Convert.ToInt32(txtZ.Text);

            c3p.MoveBy(x, y, z);

            print3DPoint();

        }

        private void btnChangeX_Click(object sender, EventArgs e)
        {
            int x;

            x = int.Parse(txtX.Text);
            c3p.SetX(x);
            print3DPoint();
        }

        private void btnChangeY_Click(object sender, EventArgs e)
        {
            int y;

            y = int.Parse(txtY.Text);
            c3p.SetY(y);
            print3DPoint();
        }

        private void btnChangeZ_Click(object sender, EventArgs e)
        {
            int z;

            z = int.Parse(txtZ.Text);
            c3p.SetZ(z);
            print3DPoint();
        }

        private void btnChangeC_Click(object sender, EventArgs e)
        {
            string c;

            c = txtC.Text;
            c3p.SetColor(c);
            print3DPoint();
        }
    }
}
