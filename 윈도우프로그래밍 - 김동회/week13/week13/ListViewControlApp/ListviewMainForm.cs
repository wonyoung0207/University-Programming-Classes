using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ListViewControlApp
{
    public partial class ListviewMainForm : Form
    {
        public ListviewMainForm()
        {
            InitializeComponent();
        }

        private void btnAdd_Click(object sender, EventArgs e)
        {
            //리스트 뷰의 아이템은 상위와 하위의 구조를 가진다. 
            //아이템에 처음 들어간 값을 기준으로, 그 아이템의 하위로 값들이 저장된다. 
            // 따라서 subitem을 이용해서 값을 추가해야 한다. 
            ListViewItem.ListViewSubItem sub1 = new ListViewItem.ListViewSubItem();
            ListViewItem.ListViewSubItem sub2 = new ListViewItem.ListViewSubItem();
            ListViewItem.ListViewSubItem sub3 = new ListViewItem.ListViewSubItem();
            ListViewItem.ListViewSubItem sub4 = new ListViewItem.ListViewSubItem();

            sub1.Text = txtName.Text;
            sub2.Text = txtAddress.Text;
            sub3.Text = txtTel.Text;
            sub4.Text = txtDept.Text;

            ListViewItem lvItem = new ListViewItem();//리스트뷰 객체생성
            lvItem.Text = txtStuNum.Text;//리스트뷰의 아이템

            lvItem.SubItems.Add(sub1);//리스트뷰의 아이템에 서브아이템 추가 
            lvItem.SubItems.Add(sub2);
            lvItem.SubItems.Add(sub3);
            lvItem.SubItems.Add(sub4);

            lstInfo.Items.Add(lvItem);//내가 지정한 리스트뷰의 아이템에 객체를 넣어줌 

        }

        private void btnRemove_Click(object sender, EventArgs e)//선택항목을 제거
        {
            if(lstInfo.SelectedItems.Count != 0)//리스트뷰의 선택된 아이템이 있다면 실행 
            {
                //선택된 아이템 항목 중 첫번쨰만 지운다. 
                lstInfo.SelectedItems[0].Remove();//하나의 아이템 항목에는 4개의 서브아이템이 존재함 
                //따라서 SelectedItems 은 여러개 선택가능
            }
        }

        private void btnPrint_Click(object sender, EventArgs e)//선택항목을 텍스트 박스에 출력
        {
            if (lstInfo.SelectedItems.Count != 0)//리스트뷰의 선택된 아이템이 있다면 실행 
            {
                txtStuNum.Text = lstInfo.SelectedItems[0].Text;//상위
                /*txtStuNum.Text = lstInfo.SelectedItems[0].SubItems[0].Text;//이것도 가능*/
                txtName.Text = lstInfo.SelectedItems[0].SubItems[1].Text;//하위
                txtAddress.Text = lstInfo.SelectedItems[0].SubItems[2].Text;
                txtTel.Text = lstInfo.SelectedItems[0].SubItems[3].Text;
                txtDept.Text = lstInfo.SelectedItems[0].SubItems[4].Text;
                
            }
        }

        private void dmView_SelectedItemChanged(object sender, EventArgs e)
        {
            //Domain은 클릭 이벤트가 아닌 체인지 이벤트가 발생한다. 
            if(dmView.Text == "Details")
            {
                lstInfo.View = View.Details;//리스트뷰의 속성인 뷰를 바꿈 
            }else if (dmView.Text == "Largeicon")
            {
                lstInfo.View = View.LargeIcon;//큰 아이콘
            }
            else
            {
                lstInfo.View = View.SmallIcon;//작은 아이콘 
            }
        }
    }
}
