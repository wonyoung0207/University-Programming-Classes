using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WhoisBigProject
{
    public partial class MainForm : Form
    {
        public MainForm()
        {
            InitializeComponent();
        }

        private void bntcheck_Click(object sender, EventArgs e)
        {
            int num1, num2;

            num1 = int.Parse(txtn1.Text);
            num2 = int.Parse(txtn2.Text);

            if(num1 > num2)
            {
                lblResult.Text = num1 + ">" + num2;
            }
            else if(num1 < num2)
            {
                lblResult.Text = num1 + "<" + num2;
            }
            else
            {
                lblResult.Text = num1 + "=" + num2;
            }

        }
    }
}
