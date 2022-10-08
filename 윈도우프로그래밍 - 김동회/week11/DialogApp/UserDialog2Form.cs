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
    public partial class UserDialog2Form : Form
    {
        private string parameter;

        public string Parameter//프로퍼티
        {
            get { return parameter; }
            set { this.parameter = value; }
        }

        public UserDialog2Form()
        {
            InitializeComponent();
        }

        private void btnAccept_Click(object sender, EventArgs e)
        {
            parameter = txtParameter.Text;
            Close();

        }

        private void btnReject_Click(object sender, EventArgs e)
        {
            parameter = "";
            Close();
        }


    }
}
