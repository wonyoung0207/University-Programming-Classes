using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace NotepadApp
{
    public partial class NotepadForm : Form
    {
        public NotepadForm()
        {
            InitializeComponent();
        }

        private void NotepadForm_Load(object sender, EventArgs e)
        {
            MessageBox.Show("Notepad V 0.1");
        }

        private void btnexit_Click(object sender, EventArgs e)
        {
            this.Close();//form을 종료

        }

        private void NotepadForm_FormClosing(object sender, FormClosingEventArgs e)
        {
            if(txtmemo.Text != "")//내용이 있다면 실행 
            {
                if(MessageBox.Show("변경 내용을 버리고 종료하시겠습니까?", 
                    "종료확인", MessageBoxButtons.YesNo) == DialogResult.Yes)
                {
                    //MessageBox.Show(내용,타이틀,버튼)
                    e.Cancel = false;//캔슬의 기본값은 true로, true면 종료를 캔스한다. 
                }
                else
                {
                    e.Cancel = true;
                }
                
            }
        }
    }
}
