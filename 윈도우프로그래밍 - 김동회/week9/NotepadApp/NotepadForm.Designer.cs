
namespace NotepadApp
{
    partial class NotepadForm
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
            this.txtmemo = new System.Windows.Forms.TextBox();
            this.btnexit = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // txtmemo
            // 
            this.txtmemo.Location = new System.Drawing.Point(12, 12);
            this.txtmemo.Multiline = true;
            this.txtmemo.Name = "txtmemo";
            this.txtmemo.ScrollBars = System.Windows.Forms.ScrollBars.Both;
            this.txtmemo.Size = new System.Drawing.Size(490, 301);
            this.txtmemo.TabIndex = 0;
            // 
            // btnexit
            // 
            this.btnexit.Location = new System.Drawing.Point(198, 339);
            this.btnexit.Name = "btnexit";
            this.btnexit.Size = new System.Drawing.Size(125, 44);
            this.btnexit.TabIndex = 1;
            this.btnexit.Text = "종료";
            this.btnexit.UseVisualStyleBackColor = true;
            this.btnexit.Click += new System.EventHandler(this.btnexit_Click);
            // 
            // NotepadForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.AutoScroll = true;
            this.ClientSize = new System.Drawing.Size(528, 415);
            this.Controls.Add(this.btnexit);
            this.Controls.Add(this.txtmemo);
            this.Name = "NotepadForm";
            this.Text = "메모장";
            this.FormClosing += new System.Windows.Forms.FormClosingEventHandler(this.NotepadForm_FormClosing);
            this.Load += new System.EventHandler(this.NotepadForm_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox txtmemo;
        private System.Windows.Forms.Button btnexit;
    }
}

