using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ArrProject
{
    public partial class frmArr : Form
    {
        public frmArr()
        {
            InitializeComponent();
        }

        private void frmArr_Click(object sender, EventArgs e)
        {

        }

        private void bntPrint_Click(object sender, EventArgs e)
        {
            int[] arr = new int[] { 1, 3, 4, 5, 6, 7, 9, 8, 2, 0 };

            for (int i = 0; i < arr.Length; i++)
            {
                if(i != 9)
                {
                    txtPrint.Text += (arr[i].ToString() + ',');
                }
                else
                {
                    txtPrint.Text += (arr[i].ToString());
                }
                
            }
        }
    }
}
