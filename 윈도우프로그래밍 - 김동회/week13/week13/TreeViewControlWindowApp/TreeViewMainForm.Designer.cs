
namespace TreeViewControlWindowApp
{
    partial class TreeViewMainForm
    {
        /// <summary>
        /// 필수 디자이너 변수입니다.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// 사용 중인 모든 리소스를 정리합니다.
        /// </summary>
        /// <param name="disposing">관리되는 리소스를 삭제해야 하면 true이고, 그렇지 않으면 false입니다.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form 디자이너에서 생성한 코드

        /// <summary>
        /// 디자이너 지원에 필요한 메서드입니다. 
        /// 이 메서드의 내용을 코드 편집기로 수정하지 마세요.
        /// </summary>
        private void InitializeComponent()
        {
            System.Windows.Forms.TreeNode treeNode41 = new System.Windows.Forms.TreeNode("C 프로그래밍");
            System.Windows.Forms.TreeNode treeNode42 = new System.Windows.Forms.TreeNode("윈도우프로그래밍");
            System.Windows.Forms.TreeNode treeNode43 = new System.Windows.Forms.TreeNode("자바프로그래밍");
            System.Windows.Forms.TreeNode treeNode44 = new System.Windows.Forms.TreeNode("자료구조");
            System.Windows.Forms.TreeNode treeNode45 = new System.Windows.Forms.TreeNode("컴퓨터공학과", new System.Windows.Forms.TreeNode[] {
            treeNode41,
            treeNode42,
            treeNode43,
            treeNode44});
            System.Windows.Forms.TreeNode treeNode46 = new System.Windows.Forms.TreeNode("전자공학과");
            System.Windows.Forms.TreeNode treeNode47 = new System.Windows.Forms.TreeNode("콘텐츠IT");
            System.Windows.Forms.TreeNode treeNode48 = new System.Windows.Forms.TreeNode("교과목", new System.Windows.Forms.TreeNode[] {
            treeNode45,
            treeNode46,
            treeNode47});
            this.tvCourse = new System.Windows.Forms.TreeView();
            this.lstCourse = new System.Windows.Forms.ListBox();
            this.btnAdd = new System.Windows.Forms.Button();
            this.btnNodeRemove = new System.Windows.Forms.Button();
            this.btnListRemove = new System.Windows.Forms.Button();
            this.lblAddNode = new System.Windows.Forms.Label();
            this.txtAddNode = new System.Windows.Forms.TextBox();
            this.btnAddNode = new System.Windows.Forms.Button();
            this.btnNodeFind = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.txtFindNode = new System.Windows.Forms.TextBox();
            this.SuspendLayout();
            // 
            // tvCourse
            // 
            this.tvCourse.Location = new System.Drawing.Point(12, 25);
            this.tvCourse.Name = "tvCourse";
            treeNode41.Name = "cprog";
            treeNode41.Text = "C 프로그래밍";
            treeNode42.Name = "windpro";
            treeNode42.Text = "윈도우프로그래밍";
            treeNode43.Name = "javapro";
            treeNode43.Text = "자바프로그래밍";
            treeNode44.Name = "struct";
            treeNode44.Text = "자료구조";
            treeNode45.Name = "computer";
            treeNode45.Text = "컴퓨터공학과";
            treeNode45.ToolTipText = "마우스올려놨을때 팁 표시";
            treeNode46.Name = "elec";
            treeNode46.Text = "전자공학과";
            treeNode47.Name = "cont";
            treeNode47.Text = "콘텐츠IT";
            treeNode48.Name = "root";
            treeNode48.Text = "교과목";
            this.tvCourse.Nodes.AddRange(new System.Windows.Forms.TreeNode[] {
            treeNode48});
            this.tvCourse.Size = new System.Drawing.Size(190, 255);
            this.tvCourse.TabIndex = 0;
            // 
            // lstCourse
            // 
            this.lstCourse.FormattingEnabled = true;
            this.lstCourse.ItemHeight = 15;
            this.lstCourse.Location = new System.Drawing.Point(335, 21);
            this.lstCourse.Name = "lstCourse";
            this.lstCourse.Size = new System.Drawing.Size(189, 259);
            this.lstCourse.TabIndex = 1;
            // 
            // btnAdd
            // 
            this.btnAdd.Location = new System.Drawing.Point(232, 128);
            this.btnAdd.Name = "btnAdd";
            this.btnAdd.Size = new System.Drawing.Size(75, 23);
            this.btnAdd.TabIndex = 2;
            this.btnAdd.Text = ">>";
            this.btnAdd.UseVisualStyleBackColor = true;
            this.btnAdd.Click += new System.EventHandler(this.btnAdd_Click);
            // 
            // btnNodeRemove
            // 
            this.btnNodeRemove.Location = new System.Drawing.Point(12, 301);
            this.btnNodeRemove.Name = "btnNodeRemove";
            this.btnNodeRemove.Size = new System.Drawing.Size(80, 31);
            this.btnNodeRemove.TabIndex = 2;
            this.btnNodeRemove.Text = "노드삭제";
            this.btnNodeRemove.TextAlign = System.Drawing.ContentAlignment.BottomCenter;
            this.btnNodeRemove.UseVisualStyleBackColor = true;
            this.btnNodeRemove.Click += new System.EventHandler(this.btnNodeRemove_Click);
            // 
            // btnListRemove
            // 
            this.btnListRemove.Location = new System.Drawing.Point(335, 301);
            this.btnListRemove.Name = "btnListRemove";
            this.btnListRemove.Size = new System.Drawing.Size(169, 31);
            this.btnListRemove.TabIndex = 2;
            this.btnListRemove.Text = "리스트아이템삭제";
            this.btnListRemove.TextAlign = System.Drawing.ContentAlignment.BottomCenter;
            this.btnListRemove.UseVisualStyleBackColor = true;
            this.btnListRemove.Click += new System.EventHandler(this.btnListRemove_Click);
            // 
            // lblAddNode
            // 
            this.lblAddNode.AutoSize = true;
            this.lblAddNode.Location = new System.Drawing.Point(12, 401);
            this.lblAddNode.Name = "lblAddNode";
            this.lblAddNode.Size = new System.Drawing.Size(67, 15);
            this.lblAddNode.TabIndex = 3;
            this.lblAddNode.Text = "노드추가";
            // 
            // txtAddNode
            // 
            this.txtAddNode.Location = new System.Drawing.Point(86, 394);
            this.txtAddNode.Name = "txtAddNode";
            this.txtAddNode.Size = new System.Drawing.Size(116, 25);
            this.txtAddNode.TabIndex = 4;
            // 
            // btnAddNode
            // 
            this.btnAddNode.Location = new System.Drawing.Point(86, 436);
            this.btnAddNode.Name = "btnAddNode";
            this.btnAddNode.Size = new System.Drawing.Size(96, 31);
            this.btnAddNode.TabIndex = 2;
            this.btnAddNode.Text = "노드 추가";
            this.btnAddNode.TextAlign = System.Drawing.ContentAlignment.BottomCenter;
            this.btnAddNode.UseVisualStyleBackColor = true;
            this.btnAddNode.Click += new System.EventHandler(this.btnAddNode_Click);
            // 
            // btnNodeFind
            // 
            this.btnNodeFind.Location = new System.Drawing.Point(316, 436);
            this.btnNodeFind.Name = "btnNodeFind";
            this.btnNodeFind.Size = new System.Drawing.Size(96, 31);
            this.btnNodeFind.TabIndex = 2;
            this.btnNodeFind.Text = "노드검색";
            this.btnNodeFind.TextAlign = System.Drawing.ContentAlignment.BottomCenter;
            this.btnNodeFind.UseVisualStyleBackColor = true;
            this.btnNodeFind.Click += new System.EventHandler(this.btnNodeFind_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(258, 401);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(52, 15);
            this.label1.TabIndex = 3;
            this.label1.Text = "노드명";
            // 
            // txtFindNode
            // 
            this.txtFindNode.Location = new System.Drawing.Point(316, 394);
            this.txtFindNode.Name = "txtFindNode";
            this.txtFindNode.Size = new System.Drawing.Size(116, 25);
            this.txtFindNode.TabIndex = 4;
            // 
            // TreeViewMainForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(553, 507);
            this.Controls.Add(this.txtFindNode);
            this.Controls.Add(this.txtAddNode);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.lblAddNode);
            this.Controls.Add(this.btnNodeFind);
            this.Controls.Add(this.btnListRemove);
            this.Controls.Add(this.btnAddNode);
            this.Controls.Add(this.btnNodeRemove);
            this.Controls.Add(this.btnAdd);
            this.Controls.Add(this.lstCourse);
            this.Controls.Add(this.tvCourse);
            this.Name = "TreeViewMainForm";
            this.Text = "TreeViewControlExcample";
            this.Load += new System.EventHandler(this.TreeViewMainForm_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TreeView tvCourse;
        private System.Windows.Forms.ListBox lstCourse;
        private System.Windows.Forms.Button btnAdd;
        private System.Windows.Forms.Button btnNodeRemove;
        private System.Windows.Forms.Button btnListRemove;
        private System.Windows.Forms.Label lblAddNode;
        private System.Windows.Forms.TextBox txtAddNode;
        private System.Windows.Forms.Button btnAddNode;
        private System.Windows.Forms.Button btnNodeFind;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox txtFindNode;
    }
}

