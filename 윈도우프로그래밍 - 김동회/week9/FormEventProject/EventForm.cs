using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace FormEventProject
{
    public partial class EventForm : Form
    {
        public EventForm()
        {
            InitializeComponent();
        }

        private void EventForm_Load(object sender, EventArgs e)
        {//form의 Load 이벤트는 form이 열리기 전 실행되고, 실행 맞친 후 form 이 로드된다.
            //form의 size 프로퍼티에 있는 width를 조정. this 는 현재 form 을 가리킨다.
            String formInfo = "EventForm의 넓이 : " + this.Width + 
                "높이 : " + this.Height;
            MessageBox.Show(formInfo);



        }

        private void EventForm_MouseMove(object sender, MouseEventArgs e)
        {
            //form에서 마우스가 움직일때 조정하도록 form에서 마우스무브 이벤트 적용함 
            //MouseEventArgs에 마우스 이벤트에 해당하는 기능들을 가지고 잇다.
            lblOut.Text = "마우스 좌표 : x :" + e.X + "y : " + e.Y;
            


        }

        private void EventForm_MouseClick(object sender, MouseEventArgs e)
        {
            //click 이벤트와는 다르게 마우스 클릭은 어디를 누르는것이 중요한게 아니라
            //마우스 기기에서 어떤 버튼이 눌렸는지를 출력해준다. 
            MessageBox.Show(e.Button.ToString());
        }

        private void EventForm_KeyPress(object sender, KeyPressEventArgs e)
        {
            //KeyPress 는 KeyDown 과 비슷하지만 키가 눌린 값에 더 초점을 두고,
            //KeyDown은 눌린 상황에 대한 것에 초점을 둔다.
            

            MessageBox.Show(e.KeyChar.ToString());
            //keychar은 눌린 키 값을 가지고 있고, 
            //이것을 문자열로 바꿔서 메시지 박스에 출력해 줘야 한다. 

        }

        private void EventForm_KeyDown(object sender, KeyEventArgs e)
        {
            //KeyDown 에서는 출력되지 않는 키값을 다룬다. 
            //Shift , Menu, Control 키는 KeyDown 이벤트에서 발생하는 것이다. 
            MessageBox.Show(e.KeyCode.ToString());//keycode는 정수형이기 때문에 
        }
    }
}
