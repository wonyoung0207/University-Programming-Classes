using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace CircleVolumeProject
{
    public partial class frmCircleVolume : Form
    {
        public frmCircleVolume()
        {
            InitializeComponent();
        }

        private void btnCalc_Click(object sender, EventArgs e)
        {
            int r;
            double v;
            double s;

            r = int.Parse(txtR.Text);


            v = (4 / 3) * Math.PI * Math.Pow(r, 3);
            v = Math.Round(v * 100) / 100;//math.round는 반올림하기 위해서 사용함. 

            s = Math.Round((4 * Math.Pow(Math.PI, 2)) * 100)/100;

            txtV.Text = v.ToString();
            txtS.Text = s.ToString();

        }
    }
}
