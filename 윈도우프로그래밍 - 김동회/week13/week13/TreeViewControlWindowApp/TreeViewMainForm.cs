using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace TreeViewControlWindowApp
{
    public partial class TreeViewMainForm : Form
    {
        public TreeViewMainForm()
        {
            InitializeComponent();
        }

        private void btnAdd_Click(object sender, EventArgs e)
        {
            lstCourse.Items.Add(tvCourse.SelectedNode.Text);//선택된 노드를 list로 추가 
        }

        private void TreeViewMainForm_Load(object sender, EventArgs e)
        {
            tvCourse.ExpandAll();//로드될때 트리가 펼쳐져있게 만들기 위해서 
        }

        private void btnNodeRemove_Click(object sender, EventArgs e)
        {
            if (tvCourse.SelectedNode.Nodes.Count == 0)
            {   //하위노드가 없을 경우에만 삭제할수 있도록
                tvCourse.Nodes.Remove(tvCourse.SelectedNode);//tvCourse.SelectedNode 는 객체이다. 
                //tvCourse.Nodes.RemoveAt(tvCourse.SelectedNode.Index);//RemoveAt 은 선택된 노드의 인덱스를 줘야한다.
            }
            else
            {
                MessageBox.Show("자식 노드가 있는경우 삭제 불가");            
            }

        }

        private void btnListRemove_Click(object sender, EventArgs e)
        {
            if(lstCourse.SelectedIndex != 1)//삭제할 아이템이 있을경우 삭제 
            {
                lstCourse.Items.Remove(lstCourse.SelectedItem);
                //lstCourse.Items.RemoveAt(lstCourse.SelectedIndex);
            }
            else
            {
                MessageBox.Show("삭제할 아이템이 없거나 선택이 안됐습니다. ");
            }
        }

        private void btnAddNode_Click(object sender, EventArgs e)
        {
            if (txtAddNode.Text != "")//텍스트가 비어있지 않다면 
            {
                //선택된 treenode의 노드들에다가 입력한 노드를 추가한다. 
                tvCourse.SelectedNode.Nodes.Add(txtAddNode.Text, txtAddNode.Text);//node는 key값과 text값을 넣어주면 됨
            }
            else//텍스트가 비어있다면 
            {
                MessageBox.Show("텍스트가 비어있습니다. 추가할 수 없습니다. ");
            }
        }

        private void btnNodeFind_Click(object sender, EventArgs e)
        {
            //Find 는 해당 노드의 key값을 찾는다. 
            TreeNode t = tvCourse.Nodes.Find(txtFindNode.Text, true)[0];//노드들에서 해당 key값을 찾는다. 
            tvCourse.SelectedNode = t;

            if(tvCourse.SelectedNode != null)//선택된게 있다면 
            {
                tvCourse.ExpandAll();//tree를 확장시키고
                tvCourse.Select();//tree를 선택하면 됨 
            }
        }
    }
}
