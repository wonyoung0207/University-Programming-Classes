using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace MenuProject
{
    public partial class MainForm : Form
    {
        public MainForm()
        {
            InitializeComponent();
        }

        private void mnuOpen_Click(object sender, EventArgs e)
        {
            MessageBox.Show("파일열기메뉴선택","ToolStripMenuItem_Click");

        }

        private void mnuSave_Click(object sender, EventArgs e)
        {
            MessageBox.Show("파일저장메뉴선택", "ToolStripMenuItem_Click");

        }

        private void mnuExit_Click(object sender, EventArgs e)
        {
            this.Close();

        }

        private void mnuLeft_Click(object sender, EventArgs e)//지금은 이벤트연결 안해놔서 실행 안됨 
        {
            mnuLeft.Checked = true;
            mnuCenter.Checked = false;
            mnuRight.Checked = false;
            txtEdit.TextAlign = HorizontalAlignment.Left;


        }

        private void mnuCenter_Click(object sender, EventArgs e)
        {
            mnuLeft.Checked = false;
            mnuCenter.Checked = true;
            mnuRight.Checked = false;
            txtEdit.TextAlign = HorizontalAlignment.Center;
        }

        private void mnuRight_Click(object sender, EventArgs e)
        {
            mnuLeft.Checked = false;
            mnuCenter.Checked = false;
            mnuRight.Checked = true;
            txtEdit.TextAlign = HorizontalAlignment.Right;
        }

        private void mnuAlign_Click(object sender, EventArgs e)//정렬 어떤것을 선택하든지 이 이벤트 발생하도록 함 
            //텍스트박스의 정렬을 바꿔주는 함수 
        {   //
            ToolStripMenuItem item = (ToolStripMenuItem)sender;
            //sender는 전달받은 객체로, item 변수에다가 형변환을 해서 넣어준다. 

            foreach(ToolStripMenuItem it in item.Owner.Items)
            {
                if(it == item)
                {
                    it.Checked = true;//클릭된 메뉴만 checked를 true로 바꿔준다
                    
                }
                else
                {
                    it.Checked = false;
                }
            }
        }

        private void mnuCopy_Click(object sender, EventArgs e)
        {
            Clipboard.SetText(txtEdit.Text);//ctrl + c 와 같은 기능을 함 

        }

        private void mnuPaste_Click(object sender, EventArgs e)
        {
            txtEdit.Text = Clipboard.GetText();//crtl + v 와 같은 기능을 함
        }

        private void MainForm_MouseMove(object sender, MouseEventArgs e)//상태바의 기능은 프로그램의 상세 내용 표시이다. 
        {
            //statusStrip1.Items[0].Text = e.X + ", " + e.Y;//이것도됨 
            toolLabel.Text = e.X + ", " + e.Y;
        }

        private void toolLabel_Click(object sender, EventArgs e)
        {
            //StatusStrip s = (StatusStrip)sender;//상태바에 여러개 있을 경우
            //MessageBox.Show(e.ClickedItem.Text, "StatusStrip_Click");

            MessageBox.Show(e.ToString(), "StatusStrip_Click");
        }
    }
}
