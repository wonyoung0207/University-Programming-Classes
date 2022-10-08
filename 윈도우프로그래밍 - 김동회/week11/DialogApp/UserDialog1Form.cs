using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace DialogApp
{
    public partial class UserDialog1Form : Form
    {
        private string parameter;

        public string Parameter//프로퍼티
        {
            get{ return parameter; }
            set { this.parameter = value;  }
        }

        public UserDialog1Form()
        {
            InitializeComponent();

            //생성자 매개변수로 parameter 받앗을경우 밑에 2개 사용가능 
            //this.txtParameter.Text = parameter;
            //this.parameter = parameter;
        }

        private void btnClose_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void UserDialog1Form_Load(object sender, EventArgs e)
        {
            txtParameter.Text = this.parameter;
        }
    }
}
