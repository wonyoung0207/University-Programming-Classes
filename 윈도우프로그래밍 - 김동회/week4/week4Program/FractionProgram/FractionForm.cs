using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace FractionProgram
{
    public partial class FractionForm : Form
    {
        Fraction f = null;
        public FractionForm()
        {
            InitializeComponent();
        }

        private void btn1_Click(object sender, EventArgs e)
        {
            int n1, n2, n3, d1, d2, d3;

            n1 = int.Parse(txtN1.Text);
            d1 = int.Parse(txtD1.Text);
            n2 = int.Parse(txtN2.Text);
            d2 = int.Parse(txtD2.Text);

            f = new Fraction(n1, d1, n2, d2);//분자분모 셋팅

            f.Calc();//통분과 약문 진행해서 this.n3와 this.d3에 저장함.

            txtN3.Text = f.GetN3() + "";
            txtD3.Text = f.GetD3() + "";




        }
    }
}
