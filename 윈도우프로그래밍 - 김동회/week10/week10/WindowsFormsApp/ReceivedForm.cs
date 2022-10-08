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
    public partial class ReceivedForm : Form
    {
        public ReceivedForm()
        {
            InitializeComponent();
        }
        public ReceivedForm(String name, int age, String gender,int year,int month, int day, String favorite )

        {
            InitializeComponent();//이걸 해줘야 택스트들이 생성되는 것임. 따라서 꼭 해줘야 함 
            txtname.Text = name;
            txtage.Text = age.ToString();
            txtGender.Text = gender;
            txtFavorite.Text = favorite;
            txtyear.Text = year + "";
            txtMonth.Text = month + "";
            txtDay.Text = day + "";

        }

        public ReceivedForm(Info info)//생성자 매개변수를 객체로 주는 방법 -> 프로퍼티 이용 

        {
            InitializeComponent();//이걸 해줘야 택스트들이 생성되는 것임. 따라서 꼭 해줘야 함 
            txtname.Text = info.Name;
            txtage.Text = info.Age.ToString();
            txtGender.Text = info.Gender;
            txtFavorite.Text = info.Favorite;
            txtyear.Text = info.Year + "";
            txtMonth.Text = info.Month + "";
            txtDay.Text = info.Day + "";

        }

        private void btnClose_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
