
namespace ThreadExamProject
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
            this.btnRun = new System.Windows.Forms.Button();
            this.txtView1 = new System.Windows.Forms.TextBox();
            this.txtView2 = new System.Windows.Forms.TextBox();
            this.btnStop = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // btnRun
            // 
            this.btnRun.Location = new System.Drawing.Point(222, 12);
            this.btnRun.Name = "btnRun";
            this.btnRun.Size = new System.Drawing.Size(101, 45);
            this.btnRun.TabIndex = 0;
            this.btnRun.Text = "실행";
            this.btnRun.UseVisualStyleBackColor = true;
            this.btnRun.Click += new System.EventHandler(this.btnRun_Click);
            // 
            // txtView1
            // 
            this.txtView1.Location = new System.Drawing.Point(28, 89);
            this.txtView1.Multiline = true;
            this.txtView1.Name = "txtView1";
            this.txtView1.Size = new System.Drawing.Size(188, 257);
            this.txtView1.TabIndex = 1;
            // 
            // txtView2
            // 
            this.txtView2.Location = new System.Drawing.Point(329, 89);
            this.txtView2.Multiline = true;
            this.txtView2.Name = "txtView2";
            this.txtView2.Size = new System.Drawing.Size(188, 257);
            this.txtView2.TabIndex = 1;
            // 
            // btnStop
            // 
            this.btnStop.Location = new System.Drawing.Point(222, 189);
            this.btnStop.Name = "btnStop";
            this.btnStop.Size = new System.Drawing.Size(101, 45);
            this.btnStop.TabIndex = 0;
            this.btnStop.Text = "멈춤";
            this.btnStop.UseVisualStyleBackColor = true;
            this.btnStop.Click += new System.EventHandler(this.btnStop_Click);
            // 
            // MainForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(583, 416);
            this.Controls.Add(this.txtView2);
            this.Controls.Add(this.txtView1);
            this.Controls.Add(this.btnStop);
            this.Controls.Add(this.btnRun);
            this.Name = "MainForm";
            this.Text = "스레드 프로그램";
            this.Load += new System.EventHandler(this.MainForm_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button btnRun;
        private System.Windows.Forms.TextBox txtView1;
        private System.Windows.Forms.TextBox txtView2;
        private System.Windows.Forms.Button btnStop;
    }
}

