using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ComplexCalc
{
    public partial class MainForm : Form
    {
        Complex c1 = null;
        Complex c2 = null;
        Complex c3 = null;

        public MainForm()
        {
            InitializeComponent();
        }

        private void label4_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            double Creal, Cimaginary;

            seting();

            c3 = c1 + c2;

            Creal = c3.Real;
            Cimaginary = c3.Imaginary;

            txtcr.Text = Creal.ToString();
            txtci.Text = Cimaginary.ToString();

        }
        private void button2_Click(object sender, EventArgs e)
        {
            double Creal, Cimaginary;

            seting();

            c3 = c1 * c2;

            Creal = c3.Real;
            Cimaginary = c3.Imaginary;

            txtcr.Text = Creal.ToString();
            txtci.Text = Cimaginary.ToString();
        }

        public void seting()
        {
            double Areal, Aimaginary;
            double Breal, Bimaginary;


            Areal = Convert.ToDouble(txtar.Text);
            Aimaginary = Double.Parse(txtai.Text);

            Breal = Convert.ToDouble(txtbr.Text);
            Bimaginary = Double.Parse(txtbi.Text);

            c1 = new Complex(Areal, Aimaginary);
            c2 = new Complex(Breal, Bimaginary);

        }


    }
}
