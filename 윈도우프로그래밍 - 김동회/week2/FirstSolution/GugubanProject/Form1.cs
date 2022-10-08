using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace GugubanProject
{
    public partial class gugudanPrint : Form
    {
        public gugudanPrint()
        {
            InitializeComponent();
        }

        private void bntPrint_Click(object sender, EventArgs e)
        {
            int num;
            int result;

            num = int.Parse(txtdan.Text);
            txtPrint.Text = "";
            for(int i = 1; i < 10; i++)
            {
                result = num * i;
                txtPrint.Text += i.ToString() + "*" + num.ToString() + "=" + result.ToString() + Environment.NewLine;

            }

        }
    }
}
