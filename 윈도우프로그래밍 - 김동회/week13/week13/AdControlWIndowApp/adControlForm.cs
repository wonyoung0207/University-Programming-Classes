using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace AdControlWIndowApp
{
    public partial class adControlForm : Form
    {
        public adControlForm()
        {
            InitializeComponent();
        }

        private void nUpDown_ValueChanged(object sender, EventArgs e)
        {
            //서로의 값이 바뀌면 둘다 바뀌도록 
            tvValue.Value = (int)nUpDown.Value;
            //progress는 진행사항을 알려줌
            progress.Maximum = (int)nUpDown.Value;
            //트랙바와 업다운 컨트롤의 값으로 맥시멈 설정하면 유동적이게 됨
        }

        private void tvValue_Scroll(object sender, EventArgs e)
        {
            nUpDown.Value = tvValue.Value;//스크롤 옮기면 updown 컨트롤도 같이 바뀌도록 설정 
            progress.Maximum = tvValue.Value;//프로그래스 컨트롤의 Maximum 값을 변경된 값으로 설정 
        }

        private void btnStart_Click(object sender, EventArgs e)
        {
            timer1.Start();//timer1 이라는 이벤트를 시작 -> 컴포넌트 형식으로, 사용자에게 안보임 
        }

        private void timer1_Tick(object sender, EventArgs e)//timer1 이벤트가 발생했을때 호출되는 메소드 
        {
            if(progress.Value < progress.Maximum)//멕시멈보다 작을때까지만 반복 
            {//프로그래스 컨트롤을 이용해서 value 프로퍼티를 변경 
                progress.Value += 1;
            }
        }
    }
}
