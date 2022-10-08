using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsForms
{
    public partial class MainForm : Form
    {
        public MainForm()
        {
            InitializeComponent();
        }

        private void btnCreateForm_Click(object sender, EventArgs e)
        {
            SubFrom sf = new SubFrom();
            sf.Text = txtTitle.Text;
            sf.Location = new Point(int.Parse(txtX.Text), int.Parse(txtY.Text));
            //location은 포인터 형으로 사용해야 한다. 
            sf.Size = new Size(int.Parse(txtWidth.Text), int.Parse(txtHeight.Text));
            sf.Opacity = double.Parse(txtOpacity.Text);//폼의 투명도를 나타냄

            if(rdoNone.Checked)
            {
                sf.FormBorderStyle = FormBorderStyle.None;//조절가능 
            }
            else if(rdoSingle.Checked)
            {
                sf.FormBorderStyle = FormBorderStyle.FixedSingle;//폼 태두리를 조절 못하게 함
            }
            else
            {
                sf.FormBorderStyle = FormBorderStyle.FixedToolWindow;//도구상자모양으로 뜸, 크기조절 x 
            }


            sf.Show();//메인폼으로 돌아올 수 있음
            //sf.ShowDialog();// 메인폼으로 다시 돌아오지 못함 

        }
    }
}
