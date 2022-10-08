using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Threading;//스레드 사용하려면 필요하다. 

namespace ThreadExamProject
{
    public partial class MainForm : Form
    {

        Thread t1, t2;
        public MainForm()
        {
            InitializeComponent();
        }

        private void btnRun_Click(object sender, EventArgs e)
        {
            //스레드 이용방법 
            //1. 먼저 스레드 델리게이트(ThreadStart)를 이용해 사용하고자 할 메소드를 위임시킨다.
            //2. 스레드를 생성하고, 생성시 매개변수로 델리게이트를 넘겨준다. 
            //3. 스레드 객체의  Start 메소드를 이용해서 스레드를 실행시킨다. 

            //스레드 생성과 실행
            //ThreadStart라는 델리게이트에 매소드를 위임시켜준다.
            ThreadStart ts1 = new ThreadStart(print_increase);
            ThreadStart ts2 = new ThreadStart(print_decrease);

            t1 = new Thread(ts1);//ts1 이라는 델리게이트를 이용해 t1스레드를 만든다.
            t2 = new Thread(ts2);

           /*Thread t1 = new Thread(ts1);//ts1 이라는 델리게이트를 이용해 t1스레드를 만든다.
            Thread t2 = new Thread(ts2);
*/
            t1.Start();
            t2.Start();

        }

        //스레드로 동작할수 있는 메소드를 2개(증가, 감소) 만들어 놓고 진행한다.
        private void print_increase()//값을 증가시키는 메소드 
        {
            int i = 0;
            while (true)
            {
                txtView1.Text += i + Environment.NewLine;
                i++;
                Thread.Sleep(1000);//1초 멈추고 다시 실행 
            }
        }

        private void print_decrease()//값을 빼나가는 메소드 
        {
            int i = 100000;
            while (true)
            {
                txtView2.Text += i + Environment.NewLine;
                i--;
                Thread.Sleep(1000);//1초 멈추고 다시 실행 
            }
        }

        private void btnStop_Click(object sender, EventArgs e)
        {
            t1.Suspend();//스레드를 일시중단시킴
            t2.Suspend();//스레드를 일시중단시킴

        }


        //스레드 이용중 크로스가 잘못되어 발생하는 오류를 해결하기 위해서 사용
        private void MainForm_Load(object sender, EventArgs e)
        {
            CheckForIllegalCrossThreadCalls = false;
        }


    }
}
