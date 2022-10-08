using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace TemperatureProject
{
    public partial class frmTemperature : Form
    {
        public frmTemperature()
        {
            InitializeComponent();
        }

        private void bntCh_Click(object sender, EventArgs e)
        {
            double C;
            double F;

            C = double.Parse(txtC.Text);

            F = (C * 9 / 5) + 32;

            txtF.Text = F.ToString();


        }
    }
}
