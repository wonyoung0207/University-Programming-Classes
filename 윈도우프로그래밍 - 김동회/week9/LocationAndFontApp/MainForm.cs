using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace LocationAndFontApp
{
    public partial class MainForm : Form
    {
        public MainForm()
        {
            InitializeComponent();
        }

        private void btnup_Click(object sender, EventArgs e)
        {
            lblHorse.Font = new Font("궁서", lblHorse.Font.Size + 1);//폰트 사이즈 조절 
                //폰트는 객체이기 때문에 객체를 만들어 넣어줘야 한다. 
        }

        private void btndown_Click(object sender, EventArgs e)
        {
            lblHorse.Font = new Font("궁서", lblHorse.Font.Size - 1);
        }

        private void btnOrigin_Click(object sender, EventArgs e)
        {
            //location은 point형 객체이기 때문에 객체 생성
            //해당 컨트롤에 Location 속성을 보면 됨 
            lblHorse.Location = new Point(139, 94);//만드는것에 따라 다를 수 있음 
        }

        private void btnU_Click(object sender, EventArgs e)
        {
            //위로 가는 것  : y좌표만 1증가시킴 
            lblHorse.Location = new Point(lblHorse.Location.X, lblHorse.Location.Y - 1);

        }

        private void btnL_Click(object sender, EventArgs e)
        {
            lblHorse.Location = new Point(lblHorse.Location.X-1, lblHorse.Location.Y);
        }

        private void btnLU_Click(object sender, EventArgs e)
        {
            lblHorse.Location = new Point(lblHorse.Location.X - 1, lblHorse.Location.Y);
            lblHorse.Location = new Point(lblHorse.Location.X, lblHorse.Location.Y - 1);
        }

        private void btnD_Click(object sender, EventArgs e)
        {
            lblHorse.Location = new Point(lblHorse.Location.X, lblHorse.Location.Y+1);
        }

        private void btnR_Click(object sender, EventArgs e)
        {
            lblHorse.Location = new Point(lblHorse.Location.X + 1, lblHorse.Location.Y);
            
        }

        private void btnRU_Click(object sender, EventArgs e)
        {
            lblHorse.Location = new Point(lblHorse.Location.X + 1, lblHorse.Location.Y - 1);//-> 이것도 됨
            
            //lblHorse.Location = new Point(lblHorse.Location.X + 1, lblHorse.Location.Y);
            //lblHorse.Location = new Point(lblHorse.Location.X, lblHorse.Location.Y - 1);
        }

        private void btnLD_Click(object sender, EventArgs e)
        {
            lblHorse.Location = new Point(lblHorse.Location.X - 1, lblHorse.Location.Y);
            lblHorse.Location = new Point(lblHorse.Location.X, lblHorse.Location.Y + 1);
        }

        private void btnRD_Click(object sender, EventArgs e)
        {
            lblHorse.Location = new Point(lblHorse.Location.X + 1, lblHorse.Location.Y);
            lblHorse.Location = new Point(lblHorse.Location.X, lblHorse.Location.Y + 1);
        }
    }
}
