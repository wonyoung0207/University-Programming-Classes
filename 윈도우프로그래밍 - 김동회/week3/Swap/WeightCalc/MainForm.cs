using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WeightCalc
{
    public partial class MainForm : Form
    {
        public MainForm()
        {
            InitializeComponent();
        }

        private void btnCalc_Click(object sender, EventArgs e)
        {
            double weight, ke, avgW, bmi;
            String ob;

            weight = double.Parse(txtWeight.Text);
            ke = double.Parse(txtKe.Text);

            avgW = (ke - 100) * 0.9;
            bmi = (weight - avgW) / avgW * 100;

            if(bmi < 20)
            {
                ob = "정상";
            }
            else if (bmi <= 30)
            {
                ob = "경도비만";
            }
            else if (bmi <= 50)
            {
                ob = "중도비만";
            }
            else
            {
                ob = "고도비만";
            }

            txtAvgW.Text = avgW.ToString();
            txtBMI.Text = bmi + "";
            txtOb.Text = ob;

        }
    }
}
