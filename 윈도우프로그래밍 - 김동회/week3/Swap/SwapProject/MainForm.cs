using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace SwapProject
{
    public partial class MainForm : Form
    {
        public MainForm()
        {
            InitializeComponent();//초기화
        }

        private void bntswap_Click(object sender, EventArgs e)
        {
            int value1, value2;
            value1 = int.Parse(txtv1.Text);
            value2 = int.Parse(txtv2.Text);

            unsafe
            {//안전하지 않은 코드일때 안전하지 않다는것을 컴퓨터에게 알려주는것
                //프로젝트 -> 속성 -> 빌드 -> 안전하지 않은 코드 허용 체크 
                //주소와 포인트 사용하려면 unsafe 를 사용해줘야한다. 
                swap(&value1, &value2);
            }

            txtv1.Text = value1.ToString();
            txtv2.Text = value2 + "";

        }
        private unsafe void swap(int* p1, int* p2)
        {
            int temp;
            temp = *p1;
            *p1 = *p2;
            *p2 = temp;
        }
    }
}
