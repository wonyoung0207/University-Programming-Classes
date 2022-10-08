using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;


namespace FileStreamProject1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnWrite_Click(object sender, EventArgs e)
        {
            if (saveFileDialog1.ShowDialog() == DialogResult.OK)
            {
                byte[] writeData = new byte[500];
                FileStream write = new FileStream(saveFileDialog1.FileName, FileMode.Create, FileAccess.Write);

                writeData = Encoding.Default.GetBytes(txtResult.Text);
                write.Seek(0, SeekOrigin.Begin);//현재 스트림의 위치를 시작점으로 옮김 
                write.Write(writeData, 0, writeData.Length);//bData = txtResult의 내용을 바이트로 바꾼 정보가 저장되어있음 
                write.Close();
            }
            else
            {
                MessageBox.Show("파일쓰기에 오류가 있습니다.");
            }
        }

        private void btnRead_Click(object sender, EventArgs e)
        {
            if (openFileDialog1.ShowDialog() == DialogResult.OK)
            {
                byte[] readData = new byte[500];
                FileStream read = new FileStream(openFileDialog1.FileName, FileMode.Open, FileAccess.Read);
                //FileMode.OpenorCreate 가능 
                read.Seek(0, SeekOrigin.Begin);//현재 스트림의 위치를 시작점으로 옮김 
                read.Read(readData, 0, readData.Length);//bData = txtResult의 내용을 바이트로 바꾼 정보가 저장되어있음
                txtResult.Text = Encoding.Default.GetString(readData,0,readData.Length);
                
                read.Close();
            }
            else
            {
                MessageBox.Show("파일오픈에 오류가 있습니다.");
            }
        }
    }
}
