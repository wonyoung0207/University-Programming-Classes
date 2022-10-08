using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ArrayFormException
{
    public partial class MainForm : Form
    {
        private int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        public MainForm()
        {
            InitializeComponent();
        }

        private void btnPrint_Click(object sender, EventArgs e)
        {
            try
            {
                int index;
                index = int.Parse(txtIndex.Text);

                txtResult.Text = this.arr[index] + "";
            }
            catch(FormatException fe)
            {
                //txtResult.Text = fe.Message;
                txtResult.Text = "정수형 인덱스가 입력되지 않았습니다. ";
            }catch(IndexOutOfRangeException ioore)
            {
                txtResult.Text = "배열의 범위를 벗어났습니다. ";

            }
            
        }

        private void btnPrintAll_Click(object sender, EventArgs e)
        {
            txtResult.Text = "";

            for(int i=0; i< arr.Length; i++)
            {
                txtResult.Text += arr[i] + ",";
            }
        }
    }
}
