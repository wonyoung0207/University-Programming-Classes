
namespace ComplexCalc
{
    partial class MainForm
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
            this.txtar = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.txtai = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.txtbr = new System.Windows.Forms.TextBox();
            this.txtbi = new System.Windows.Forms.TextBox();
            this.txtcr = new System.Windows.Forms.TextBox();
            this.txtci = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.button1 = new System.Windows.Forms.Button();
            this.button2 = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // txtar
            // 
            this.txtar.Location = new System.Drawing.Point(84, 72);
            this.txtar.Name = "txtar";
            this.txtar.Size = new System.Drawing.Size(112, 25);
            this.txtar.TabIndex = 0;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(18, 82);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(52, 15);
            this.label1.TabIndex = 1;
            this.label1.Text = "실수부";
            // 
            // txtai
            // 
            this.txtai.Location = new System.Drawing.Point(84, 166);
            this.txtai.Name = "txtai";
            this.txtai.Size = new System.Drawing.Size(112, 25);
            this.txtai.TabIndex = 0;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(18, 176);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(52, 15);
            this.label2.TabIndex = 1;
            this.label2.Text = "허수부";
            // 
            // txtbr
            // 
            this.txtbr.Location = new System.Drawing.Point(225, 72);
            this.txtbr.Name = "txtbr";
            this.txtbr.Size = new System.Drawing.Size(112, 25);
            this.txtbr.TabIndex = 0;
            // 
            // txtbi
            // 
            this.txtbi.Location = new System.Drawing.Point(225, 166);
            this.txtbi.Name = "txtbi";
            this.txtbi.Size = new System.Drawing.Size(112, 25);
            this.txtbi.TabIndex = 0;
            // 
            // txtcr
            // 
            this.txtcr.Location = new System.Drawing.Point(388, 72);
            this.txtcr.Name = "txtcr";
            this.txtcr.Size = new System.Drawing.Size(112, 25);
            this.txtcr.TabIndex = 0;
            // 
            // txtci
            // 
            this.txtci.Location = new System.Drawing.Point(388, 166);
            this.txtci.Name = "txtci";
            this.txtci.Size = new System.Drawing.Size(112, 25);
            this.txtci.TabIndex = 0;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(81, 36);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(74, 15);
            this.label3.TabIndex = 1;
            this.label3.Text = "ComplexA";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(222, 36);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(75, 15);
            this.label4.TabIndex = 1;
            this.label4.Text = "ComplexB";
            this.label4.Click += new System.EventHandler(this.label4_Click);
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(385, 36);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(75, 15);
            this.label5.TabIndex = 1;
            this.label5.Text = "ComplexC";
            this.label5.Click += new System.EventHandler(this.label4_Click);
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(148, 236);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(118, 46);
            this.button1.TabIndex = 2;
            this.button1.Text = "Add";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // button2
            // 
            this.button2.Location = new System.Drawing.Point(298, 236);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(118, 46);
            this.button2.TabIndex = 2;
            this.button2.Text = "Multiply";
            this.button2.UseVisualStyleBackColor = true;
            this.button2.Click += new System.EventHandler(this.button2_Click);
            // 
            // MainForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(537, 316);
            this.Controls.Add(this.button2);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.txtci);
            this.Controls.Add(this.txtbi);
            this.Controls.Add(this.txtai);
            this.Controls.Add(this.txtcr);
            this.Controls.Add(this.txtbr);
            this.Controls.Add(this.txtar);
            this.Name = "MainForm";
            this.Text = "복소수 계산기";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox txtar;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox txtai;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox txtbr;
        private System.Windows.Forms.TextBox txtbi;
        private System.Windows.Forms.TextBox txtcr;
        private System.Windows.Forms.TextBox txtci;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Button button2;
    }
}

