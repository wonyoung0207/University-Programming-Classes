using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ExceptionExamProject
{
    public partial class MainForm : Form
    {
        public MainForm()
        {
            InitializeComponent();
        }

        private void btnDivide_Click(object sender, EventArgs e)
        {
            int inputValue1=0, inputValue2=0;

            try
            {
                //앞에 변수에서 0으로 초기화 해주지 않으면 안됨
                //초기화를 해줘야 try에서 오류가 났을때 밑의 try에서 변수를 사용할 수 있다. 
                inputValue1 = int.Parse(txtInput1.Text);
                inputValue2 = int.Parse(txtInput2.Text);
            }
            catch (FormatException fe)//입력형식이 잘못됐을때 발생 
            {
                lblInfo.Text = "입력형식이 잘못되었습니다. 다시입력하세요";
                return;//입력이 잘못되면 그냥 프로그램 끝나게 만들기 위해서 
            }



           try
            {
                txtOutPut.Text = (inputValue1 / inputValue2) + "";
                //txtOutPut.Text = (inputValue1 / inputValue2).toString();
            }
            catch (DivideByZeroException dbze)
            {
                txtOutPut.Text = "Div/0";
                lblInfo.Text = dbze.Message;
            }


        }
    }
}
