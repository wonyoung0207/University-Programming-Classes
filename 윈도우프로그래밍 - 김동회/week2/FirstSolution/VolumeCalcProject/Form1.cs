using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace VolumeCalcProject
{
    public partial class frmVolumCalc : Form
    {
        public frmVolumCalc()
        {
            InitializeComponent();
        }

        private void textBox3_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox4_TextChanged(object sender, EventArgs e)
        {

        }

        private void btnCalc_Click(object sender, EventArgs e)
        {
            int width;
            int height;
            int depth;
            int volume;

            width = int.Parse(txtWidth.Text);
            height = int.Parse(txtHight.Text);
            depth = int.Parse(txtDepth.Text);

            volume = width * height * depth;

            txtVolume.Text = volume.ToString();
            //txtVolume.Text = volume + ""; //이것도 가능 

        }
    }
}
