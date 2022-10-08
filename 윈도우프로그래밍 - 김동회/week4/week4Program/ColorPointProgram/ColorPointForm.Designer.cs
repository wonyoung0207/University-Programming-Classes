
namespace ColorPointProgram
{
    partial class ColorPointForm
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
            this.txtX = new System.Windows.Forms.TextBox();
            this.txtY = new System.Windows.Forms.TextBox();
            this.txtC = new System.Windows.Forms.TextBox();
            this.txtZ = new System.Windows.Forms.TextBox();
            this.txtXp = new System.Windows.Forms.TextBox();
            this.txtYp = new System.Windows.Forms.TextBox();
            this.txtZp = new System.Windows.Forms.TextBox();
            this.txtCp = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.btnChangeX = new System.Windows.Forms.Button();
            this.btnChangeY = new System.Windows.Forms.Button();
            this.btnChangeC = new System.Windows.Forms.Button();
            this.btnChangeZ = new System.Windows.Forms.Button();
            this.label9 = new System.Windows.Forms.Label();
            this.label10 = new System.Windows.Forms.Label();
            this.label11 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.label7 = new System.Windows.Forms.Label();
            this.btnCreate = new System.Windows.Forms.Button();
            this.btnChange = new System.Windows.Forms.Button();
            this.btnMove = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // txtX
            // 
            this.txtX.Location = new System.Drawing.Point(77, 94);
            this.txtX.Name = "txtX";
            this.txtX.Size = new System.Drawing.Size(100, 25);
            this.txtX.TabIndex = 0;
            // 
            // txtY
            // 
            this.txtY.Location = new System.Drawing.Point(77, 138);
            this.txtY.Name = "txtY";
            this.txtY.Size = new System.Drawing.Size(100, 25);
            this.txtY.TabIndex = 0;
            // 
            // txtC
            // 
            this.txtC.Location = new System.Drawing.Point(77, 228);
            this.txtC.Name = "txtC";
            this.txtC.Size = new System.Drawing.Size(100, 25);
            this.txtC.TabIndex = 0;
            // 
            // txtZ
            // 
            this.txtZ.Location = new System.Drawing.Point(77, 181);
            this.txtZ.Name = "txtZ";
            this.txtZ.Size = new System.Drawing.Size(100, 25);
            this.txtZ.TabIndex = 0;
            // 
            // txtXp
            // 
            this.txtXp.Location = new System.Drawing.Point(414, 97);
            this.txtXp.Name = "txtXp";
            this.txtXp.Size = new System.Drawing.Size(100, 25);
            this.txtXp.TabIndex = 0;
            // 
            // txtYp
            // 
            this.txtYp.Location = new System.Drawing.Point(414, 141);
            this.txtYp.Name = "txtYp";
            this.txtYp.Size = new System.Drawing.Size(100, 25);
            this.txtYp.TabIndex = 0;
            // 
            // txtZp
            // 
            this.txtZp.Location = new System.Drawing.Point(414, 184);
            this.txtZp.Name = "txtZp";
            this.txtZp.Size = new System.Drawing.Size(100, 25);
            this.txtZp.TabIndex = 0;
            // 
            // txtCp
            // 
            this.txtCp.Location = new System.Drawing.Point(414, 231);
            this.txtCp.Name = "txtCp";
            this.txtCp.Size = new System.Drawing.Size(100, 25);
            this.txtCp.TabIndex = 0;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(21, 94);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(26, 15);
            this.label1.TabIndex = 1;
            this.label1.Text = "X :";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(21, 138);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(25, 15);
            this.label2.TabIndex = 1;
            this.label2.Text = "Y :";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(21, 184);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(26, 15);
            this.label3.TabIndex = 1;
            this.label3.Text = "Z :";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(21, 231);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(42, 15);
            this.label4.TabIndex = 1;
            this.label4.Text = "Color";
            // 
            // btnChangeX
            // 
            this.btnChangeX.Location = new System.Drawing.Point(230, 96);
            this.btnChangeX.Name = "btnChangeX";
            this.btnChangeX.Size = new System.Drawing.Size(75, 23);
            this.btnChangeX.TabIndex = 2;
            this.btnChangeX.Text = ">>";
            this.btnChangeX.UseVisualStyleBackColor = true;
            this.btnChangeX.Click += new System.EventHandler(this.btnChangeX_Click);
            // 
            // btnChangeY
            // 
            this.btnChangeY.Location = new System.Drawing.Point(230, 142);
            this.btnChangeY.Name = "btnChangeY";
            this.btnChangeY.Size = new System.Drawing.Size(75, 23);
            this.btnChangeY.TabIndex = 2;
            this.btnChangeY.Text = ">>";
            this.btnChangeY.UseVisualStyleBackColor = true;
            this.btnChangeY.Click += new System.EventHandler(this.btnChangeY_Click);
            // 
            // btnChangeC
            // 
            this.btnChangeC.Location = new System.Drawing.Point(230, 233);
            this.btnChangeC.Name = "btnChangeC";
            this.btnChangeC.Size = new System.Drawing.Size(75, 23);
            this.btnChangeC.TabIndex = 2;
            this.btnChangeC.Text = ">>";
            this.btnChangeC.UseVisualStyleBackColor = true;
            this.btnChangeC.Click += new System.EventHandler(this.btnChangeC_Click);
            // 
            // btnChangeZ
            // 
            this.btnChangeZ.Location = new System.Drawing.Point(230, 186);
            this.btnChangeZ.Name = "btnChangeZ";
            this.btnChangeZ.Size = new System.Drawing.Size(75, 23);
            this.btnChangeZ.TabIndex = 2;
            this.btnChangeZ.Text = ">>";
            this.btnChangeZ.UseVisualStyleBackColor = true;
            this.btnChangeZ.Click += new System.EventHandler(this.btnChangeZ_Click);
            // 
            // label9
            // 
            this.label9.AutoSize = true;
            this.label9.Location = new System.Drawing.Point(74, 56);
            this.label9.Name = "label9";
            this.label9.Size = new System.Drawing.Size(127, 15);
            this.label9.TabIndex = 1;
            this.label9.Text = "좌표 생성 및 변경";
            // 
            // label10
            // 
            this.label10.AutoSize = true;
            this.label10.Location = new System.Drawing.Point(411, 56);
            this.label10.Name = "label10";
            this.label10.Size = new System.Drawing.Size(107, 15);
            this.label10.TabIndex = 1;
            this.label10.Text = "현재 좌표 정보";
            // 
            // label11
            // 
            this.label11.AutoSize = true;
            this.label11.Location = new System.Drawing.Point(366, 107);
            this.label11.Name = "label11";
            this.label11.Size = new System.Drawing.Size(26, 15);
            this.label11.TabIndex = 1;
            this.label11.Text = "X :";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(366, 151);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(25, 15);
            this.label5.TabIndex = 1;
            this.label5.Text = "Y :";
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(366, 191);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(26, 15);
            this.label6.TabIndex = 1;
            this.label6.Text = "Z :";
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Location = new System.Drawing.Point(350, 241);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(42, 15);
            this.label7.TabIndex = 1;
            this.label7.Text = "Color";
            // 
            // btnCreate
            // 
            this.btnCreate.Cursor = System.Windows.Forms.Cursors.Hand;
            this.btnCreate.ImageAlign = System.Drawing.ContentAlignment.BottomLeft;
            this.btnCreate.Location = new System.Drawing.Point(87, 314);
            this.btnCreate.Name = "btnCreate";
            this.btnCreate.Size = new System.Drawing.Size(90, 23);
            this.btnCreate.TabIndex = 2;
            this.btnCreate.Text = "객체 생성";
            this.btnCreate.UseVisualStyleBackColor = true;
            this.btnCreate.Click += new System.EventHandler(this.button5_Click);
            // 
            // btnChange
            // 
            this.btnChange.Location = new System.Drawing.Point(230, 314);
            this.btnChange.Name = "btnChange";
            this.btnChange.Size = new System.Drawing.Size(75, 23);
            this.btnChange.TabIndex = 2;
            this.btnChange.Text = "변경";
            this.btnChange.UseVisualStyleBackColor = true;
            this.btnChange.Click += new System.EventHandler(this.btnChange_Click);
            // 
            // btnMove
            // 
            this.btnMove.Location = new System.Drawing.Point(369, 314);
            this.btnMove.Name = "btnMove";
            this.btnMove.Size = new System.Drawing.Size(75, 23);
            this.btnMove.TabIndex = 2;
            this.btnMove.Text = "이동";
            this.btnMove.UseVisualStyleBackColor = true;
            this.btnMove.Click += new System.EventHandler(this.btnMove_Click);
            // 
            // ColorPointForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(571, 403);
            this.Controls.Add(this.btnChangeZ);
            this.Controls.Add(this.btnMove);
            this.Controls.Add(this.btnChange);
            this.Controls.Add(this.btnCreate);
            this.Controls.Add(this.btnChangeC);
            this.Controls.Add(this.btnChangeY);
            this.Controls.Add(this.btnChangeX);
            this.Controls.Add(this.label7);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label10);
            this.Controls.Add(this.label9);
            this.Controls.Add(this.label11);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.txtCp);
            this.Controls.Add(this.txtC);
            this.Controls.Add(this.txtZp);
            this.Controls.Add(this.txtZ);
            this.Controls.Add(this.txtYp);
            this.Controls.Add(this.txtY);
            this.Controls.Add(this.txtXp);
            this.Controls.Add(this.txtX);
            this.Name = "ColorPointForm";
            this.Text = "3D Color Point";
            this.Load += new System.EventHandler(this.ColorPointForm_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox txtX;
        private System.Windows.Forms.TextBox txtY;
        private System.Windows.Forms.TextBox txtC;
        private System.Windows.Forms.TextBox txtZ;
        private System.Windows.Forms.TextBox txtXp;
        private System.Windows.Forms.TextBox txtYp;
        private System.Windows.Forms.TextBox txtZp;
        private System.Windows.Forms.TextBox txtCp;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Button btnChangeX;
        private System.Windows.Forms.Button btnChangeY;
        private System.Windows.Forms.Button btnChangeC;
        private System.Windows.Forms.Button btnChangeZ;
        private System.Windows.Forms.Label label9;
        private System.Windows.Forms.Label label10;
        private System.Windows.Forms.Label label11;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.Button btnCreate;
        private System.Windows.Forms.Button btnChange;
        private System.Windows.Forms.Button btnMove;
    }
}

