using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace FractionAddProject
{
    public partial class MainForm : Form
    {
        public MainForm()
        {
            InitializeComponent();
        }

        private void btn1_Click(object sender, EventArgs e)
        {
            int n1, n2, n3=0;
            int d1, d2, d3=0;
            int num_max = 0;//최대공약수 받을 변수 

            n1 = int.Parse(txtN1.Text);
            n2 = int.Parse(txtN2.Text);

            d1 = int.Parse(txtD1.Text);
            d2 = int.Parse(txtD2.Text);


            if(d1 == d2)
            {
                d3 = d1;
                n3 = n1 + n2;
            }
            else
            {
                d3 = d1 * d2;
                n3 = (d2 * n1) + (d1 * n2);
                //통분
            }

            num_max = Num_max(d3, n3);//최대공약수 구해서 리턴해주는 함수 
            //약분 -> 최대공약수로 나눠주면 됨 
            d3 = d3 / num_max;
            n3 = n3 / num_max;

            txtD3.Text = d3.ToString();
            txtN3.Text = n3.ToString();

        }

        private int Num_max(int x, int y)//분자 분모를 받아서 최대공약수 구해주는 함수 
        {
            int big, small,result;
            if(x <= y)
            {
                big = y;
                small = x;
            }
            else
            {
                big = x;
                small = y;
            }
            while(small != 0)
            {
                result = big % small;
                big = small;
                small = result;

            }

            return big;
        }
    }
}
