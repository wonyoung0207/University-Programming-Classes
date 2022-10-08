using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace MonthProject
{
    public partial class frmMonth : Form
    {
        public frmMonth()
        {
            InitializeComponent();
        }

        private void frmMonth_Load(object sender, EventArgs e)
        {

        }

        private void bntCh_Click(object sender, EventArgs e)
        {
            int month;
            int day;
            int result;

            month = int.Parse(txtMonth.Text);


            if (month % 2 == 0)
            {
                if (month == 2)
                {
                    result = 28;
                }
                else
                {
                    result = 30;
                }

            }
            else
            {
                result = 31;
            }
            txtDay.Text = result.ToString();
        }
    }
}
