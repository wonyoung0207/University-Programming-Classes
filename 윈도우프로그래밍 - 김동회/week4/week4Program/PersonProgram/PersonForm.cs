using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace PersonProgram
{
    public partial class PersonForm : Form
    {
        Contact c = null;
        public PersonForm()
        {
            InitializeComponent();
        }

        private void btnCreate_Click(object sender, EventArgs e)
        {
            string name, job, phone, tel, mail;
            int age;

            name = txtName.Text;
            job = txtJob.Text;
            phone = txtPhone.Text;
            tel = txtTel.Text;
            mail = txtmail.Text;
            age = int.Parse(txtAge.Text);


            c = new Contact(name, age, job, phone, tel, mail);//객체 생성 



        }

        private void btnPrint_Click(object sender, EventArgs e)
        {
            string result;

            txtResult.Text = c.ToString();

        }
    }
}
