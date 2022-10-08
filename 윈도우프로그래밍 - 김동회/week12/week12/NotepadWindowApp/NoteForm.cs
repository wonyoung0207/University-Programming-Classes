using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace NotepadWindowApp
{
    public partial class NoteForm : Form
    {
        public NoteForm()
        {
            InitializeComponent();
        }

        private void 새로만듥ㅣToolStripMenuItem_Click(object sender, EventArgs e)
        {

        }

        private void mnuExit_Click(object sender, EventArgs e)
        {
            this.Close();

        }

        private void 종료XToolStripMenuItem_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void mnuNew_Click(object sender, EventArgs e)
        {
            
            txtEdit.Text = "";
        }

        private void mnuFont_Click(object sender, EventArgs e)
        {
            if(fontDlg.ShowDialog() == DialogResult.OK)
            {//showDialog 의 결과중 OK가 클릭됐을 경우에만 적용함. 
                txtEdit.Font = fontDlg.Font;
            }

        }

        private void mnuOpen_Click(object sender, EventArgs e)
        {
            if( openDlg.ShowDialog() == DialogResult.OK)
            {
                txtEdit.Text = "파일을 열었습니다.";

            }
        }

        private void mnuClick_Click(object sender, EventArgs e)
        {
            if(saveDlg.ShowDialog() == DialogResult.OK)
            {
                txtEdit.Text = "저장했습니다. ";

            }
        }

        private void mnuPrint_Click(object sender, EventArgs e)
        {
            if (printDlg.ShowDialog() == DialogResult.OK)
            {
                txtEdit.Text = "파일을 출력합니다. ";

            }
        }

        private void viewToolStripMenuItem_Click(object sender, EventArgs e)
        {

        }
    }
}
