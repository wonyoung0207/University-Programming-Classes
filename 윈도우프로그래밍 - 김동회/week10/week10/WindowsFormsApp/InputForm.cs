using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApp
{
    public partial class InputForm : Form
    {
        public InputForm()
        {
            InitializeComponent();
        }

        private void btnSend_Click(object sender, EventArgs e)
        {
            String name, gender, favorite="";
            int age,year, month, day;

            name = txtname.Text;
            age = int.Parse(txtage.Text);
            year = int.Parse(txtyear.Text);
            month = int.Parse(txtMonth.Text);
            day = int.Parse(txtDay.Text);

            if (rdoMan.Checked)
            {
                gender = "Man";
            }
            else
            {
                gender = "Woman";
            }


            if (chkfishing.Checked)
            {
                favorite += "fishing" + Environment.NewLine;
            }
            if(chkGaming.Checked)
            {
                favorite += "Gaming" + Environment.NewLine;
            }
            if (chkSinging.Checked)
            {
                favorite += "Singing" + Environment.NewLine;
            }


            //서브폼에서 생성자 생성 후 값 전달 

            // 1. 객체를 기반한 전달
            Info info = new Info(name, age, gender, year, month, day, favorite);
            ReceivedForm rf = new ReceivedForm(info);
            

            // 2. 값을 기반한 전달 
            //ReceivedForm rf = new ReceivedForm(name,age,gender,year,month,day,favorite); 
            
            
            
            rf.Show();

        }
    }
}
