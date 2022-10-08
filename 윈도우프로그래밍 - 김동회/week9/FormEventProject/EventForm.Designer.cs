
namespace FormEventProject
{
    partial class EventForm
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
            this.lblOut = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // lblOut
            // 
            this.lblOut.AutoSize = true;
            this.lblOut.Location = new System.Drawing.Point(12, 9);
            this.lblOut.Name = "lblOut";
            this.lblOut.Size = new System.Drawing.Size(0, 15);
            this.lblOut.TabIndex = 0;
            // 
            // EventForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(682, 453);
            this.Controls.Add(this.lblOut);
            this.Name = "EventForm";
            this.Text = "MouseEvent Test";
            this.Load += new System.EventHandler(this.EventForm_Load);
            this.KeyDown += new System.Windows.Forms.KeyEventHandler(this.EventForm_KeyDown);
            this.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.EventForm_KeyPress);
            this.MouseClick += new System.Windows.Forms.MouseEventHandler(this.EventForm_MouseClick);
            this.MouseMove += new System.Windows.Forms.MouseEventHandler(this.EventForm_MouseMove);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lblOut;
    }
}

