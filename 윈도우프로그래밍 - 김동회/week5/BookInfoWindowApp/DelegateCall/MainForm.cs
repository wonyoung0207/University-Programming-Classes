using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace DelegateCall
{

    public delegate void Calc(int x, int y);//델리게이트
    public partial class MainForm : Form
    {
        Calc cal=null;

        public MainForm()
        {
            InitializeComponent();
        }

        private void add(int value1, int value2)
        {
            txtResult.Text += value1 + " + " + value2 + " = " + (value1 + value2) + Environment.NewLine;
        }
        private void sub(int value1, int value2)
        {
            txtResult.Text += value1 + " - " + value2 + " = " + (value1 - value2) + Environment.NewLine;
        }
        private void mul(int value1, int value2)
        {
            txtResult.Text += value1 + " * " + value2 + " = " + (value1 * value2) + Environment.NewLine;
        }
        private void div(int value1, int value2)
        {
            txtResult.Text += value1 + " / " + value2 + " = " + (value1 / value2) + Environment.NewLine;
        }

        private void btnPlus_Click(object sender, EventArgs e)
        {
            cal += new Calc(this.add);
        }

        private void btnSub_Click(object sender, EventArgs e)
        {
            cal += new Calc(sub);
        }

        private void btnMul_Click(object sender, EventArgs e)
        {
            cal += new Calc(mul);
        }

        private void btnDiv_Click(object sender, EventArgs e)
        {
            cal += new Calc(div);
        }

        private void btnRun_Click(object sender, EventArgs e)
        {
            int value1, value2;

            value1 = int.Parse(txtValue1.Text);
            value2 = int.Parse(txtValue2.Text);
            
            cal(value1, value2);
        }

        private void btnClear_Click(object sender, EventArgs e)
        {
            txtResult.Text = "";
            cal = null;
        }
    }
}
