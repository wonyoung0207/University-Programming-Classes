
namespace TemperatureProject
{
    partial class frmTemperature
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
            this.bntCh = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.txtF = new System.Windows.Forms.TextBox();
            this.txtC = new System.Windows.Forms.TextBox();
            this.SuspendLayout();
            // 
            // bntCh
            // 
            this.bntCh.Location = new System.Drawing.Point(155, 187);
            this.bntCh.Name = "bntCh";
            this.bntCh.Size = new System.Drawing.Size(115, 45);
            this.bntCh.TabIndex = 0;
            this.bntCh.Text = "Excute";
            this.bntCh.UseVisualStyleBackColor = true;
            this.bntCh.Click += new System.EventHandler(this.bntCh_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(62, 70);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(46, 19);
            this.label1.TabIndex = 1;
            this.label1.Text = "썹씨";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(62, 333);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(46, 19);
            this.label2.TabIndex = 2;
            this.label2.Text = "화씨";
            // 
            // txtF
            // 
            this.txtF.Location = new System.Drawing.Point(145, 323);
            this.txtF.Name = "txtF";
            this.txtF.Size = new System.Drawing.Size(163, 25);
            this.txtF.TabIndex = 3;
            // 
            // txtC
            // 
            this.txtC.Location = new System.Drawing.Point(145, 67);
            this.txtC.Name = "txtC";
            this.txtC.Size = new System.Drawing.Size(163, 25);
            this.txtC.TabIndex = 4;
            // 
            // frmTemperature
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(412, 435);
            this.Controls.Add(this.txtC);
            this.Controls.Add(this.txtF);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.bntCh);
            this.Name = "frmTemperature";
            this.Text = "섭씨/화씨 변환";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button bntCh;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox txtF;
        private System.Windows.Forms.TextBox txtC;
    }
}

