using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Drawing.Printing;//인쇄메시지 박스를 사용하기 위해서 

namespace DialogApp
{
    public partial class UserDialogMain : Form
    {
        private string text;
        public UserDialogMain()
        {
            InitializeComponent();
            
        }

        private void UserDialogMain_Load(object sender, EventArgs e)
        {
            text = txtMain.Text;
        }
        private void btnUser1_Click(object sender, EventArgs e)
        {
            UserDialog1Form uDialog1 = new UserDialog1Form();


            //값을 전달 방법 : 1. 생성자에 전달 2. 프로퍼티로 전달
            uDialog1.Parameter = txtParameter.Text;//프로퍼티 이용
            uDialog1.Show();//모덜리스(창 포커스 이동 가능) 방식으로 띄움

        }
        private void btnUser2_Click(object sender, EventArgs e)
        {
            UserDialog2Form uDialog2 = new UserDialog2Form(); 
            uDialog2.ShowDialog();
            //ShowDialog 로 해줘야 값을 재대로 가져올 수 있다. 
            txtParameter.Text = uDialog2.Parameter;//프로퍼티 이용

        }

        private void btnBasic_Click(object sender, EventArgs e)
        {
            MessageBox.Show("정보를 확인시켜주기 위한 대화상자", "기본 대화상자", MessageBoxButtons.OK,MessageBoxIcon.Information);
        }

        private void btnOkCalcel_Click(object sender, EventArgs e)
        {
            MessageBox.Show("사용자로부터 Ok Cancel을 확인하기 위한 대화상자 ", "Ok Calcel 대화상자", MessageBoxButtons.OKCancel, MessageBoxIcon.Information);
        }

        private void btnYesNo_Click(object sender, EventArgs e)
        {
            MessageBox.Show("사용자로부터 Yes No Cancel을 확인하기 위한 대화상자 ", "Yes No Cancel 대화상자", MessageBoxButtons.YesNoCancel, MessageBoxIcon.Question);
        }

        private void btnAbort_Click(object sender, EventArgs e)
        {
            MessageBox.Show("사용자로부터 Abort, Rerty, Ignore 를 결정하기 위한 대화상자 ", "Abort, Rerty, Ignore 대화상자", MessageBoxButtons.AbortRetryIgnore, MessageBoxIcon.Error);
        }

        private void btnColorDialog_Click(object sender, EventArgs e)
        {   //백컬러를 설정 
            colorDialog1.ShowDialog();
            txtMain.BackColor = colorDialog1.Color;

        }

        private void btnFontDialog_Click(object sender, EventArgs e)
        {
            fontDialog1.ShowColor = true;//color 보려면 바꿔줘야함 
            fontDialog1.ShowDialog();
            txtMain.Font = fontDialog1.Font;
            txtMain.ForeColor = fontDialog1.Color;
        }

        private void btnOpenFileDialog_Click(object sender, EventArgs e)
        {
            openFileDialog1.ShowDialog();
            txtMain.Text = openFileDialog1.FileName;//파일의 경로를 복사 
            
        }

        private void btnFolderBrowser_Click(object sender, EventArgs e)
        {
            folderBrowserDialog1.ShowDialog();
            txtMain.Text = folderBrowserDialog1.SelectedPath;//폴더의 경로를 복사 
        }

        private void btnPrintDialog_Click(object sender, EventArgs e)
        {
            //using System.Drawing.Printing 를 네임스페이스에 추가해야함 
            PrinterSettings printer = new PrinterSettings();//기본 프린터 설정
            PrintDocument pd = new PrintDocument();//출력물 설정 -> 인쇄될 내용을 담은 객체 

            printDialog1.PrinterSettings = printer;
            printDialog1.Document = pd;

            DialogResult dr = printDialog1.ShowDialog();
            txtMain.Text = printer.PrinterName;

        }
    }
}
