
namespace DialogApp
{
    partial class UserDialogMain
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
            this.btnUser1 = new System.Windows.Forms.Button();
            this.btnUser2 = new System.Windows.Forms.Button();
            this.txtParameter = new System.Windows.Forms.TextBox();
            this.txtMain = new System.Windows.Forms.TextBox();
            this.btnBasic = new System.Windows.Forms.Button();
            this.btnOkCalcel = new System.Windows.Forms.Button();
            this.btnYesNo = new System.Windows.Forms.Button();
            this.btnAbort = new System.Windows.Forms.Button();
            this.btnColorDialog = new System.Windows.Forms.Button();
            this.btnFontDialog = new System.Windows.Forms.Button();
            this.btnOpenFileDialog = new System.Windows.Forms.Button();
            this.btnFolderBrowser = new System.Windows.Forms.Button();
            this.btnPrintDialog = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.colorDialog1 = new System.Windows.Forms.ColorDialog();
            this.fontDialog1 = new System.Windows.Forms.FontDialog();
            this.folderBrowserDialog1 = new System.Windows.Forms.FolderBrowserDialog();
            this.openFileDialog1 = new System.Windows.Forms.OpenFileDialog();
            this.printDialog1 = new System.Windows.Forms.PrintDialog();
            this.SuspendLayout();
            // 
            // btnUser1
            // 
            this.btnUser1.Location = new System.Drawing.Point(453, 205);
            this.btnUser1.Name = "btnUser1";
            this.btnUser1.Size = new System.Drawing.Size(169, 85);
            this.btnUser1.TabIndex = 0;
            this.btnUser1.Text = "대화상자로 값 전달";
            this.btnUser1.UseVisualStyleBackColor = true;
            this.btnUser1.Click += new System.EventHandler(this.btnUser1_Click);
            // 
            // btnUser2
            // 
            this.btnUser2.Location = new System.Drawing.Point(453, 395);
            this.btnUser2.Name = "btnUser2";
            this.btnUser2.Size = new System.Drawing.Size(169, 85);
            this.btnUser2.TabIndex = 0;
            this.btnUser2.Text = "대화상자로부터 값 전달";
            this.btnUser2.UseVisualStyleBackColor = true;
            this.btnUser2.Click += new System.EventHandler(this.btnUser2_Click);
            // 
            // txtParameter
            // 
            this.txtParameter.Location = new System.Drawing.Point(453, 335);
            this.txtParameter.Name = "txtParameter";
            this.txtParameter.Size = new System.Drawing.Size(169, 25);
            this.txtParameter.TabIndex = 1;
            // 
            // txtMain
            // 
            this.txtMain.Location = new System.Drawing.Point(23, 23);
            this.txtMain.Multiline = true;
            this.txtMain.Name = "txtMain";
            this.txtMain.Size = new System.Drawing.Size(558, 64);
            this.txtMain.TabIndex = 2;
            // 
            // btnBasic
            // 
            this.btnBasic.Location = new System.Drawing.Point(23, 111);
            this.btnBasic.Name = "btnBasic";
            this.btnBasic.Size = new System.Drawing.Size(172, 85);
            this.btnBasic.TabIndex = 3;
            this.btnBasic.Text = "기본 대화상자";
            this.btnBasic.UseVisualStyleBackColor = true;
            this.btnBasic.Click += new System.EventHandler(this.btnBasic_Click);
            // 
            // btnOkCalcel
            // 
            this.btnOkCalcel.Location = new System.Drawing.Point(23, 205);
            this.btnOkCalcel.Name = "btnOkCalcel";
            this.btnOkCalcel.Size = new System.Drawing.Size(172, 85);
            this.btnOkCalcel.TabIndex = 3;
            this.btnOkCalcel.Text = "OK / CANCEL";
            this.btnOkCalcel.UseVisualStyleBackColor = true;
            this.btnOkCalcel.Click += new System.EventHandler(this.btnOkCalcel_Click);
            // 
            // btnYesNo
            // 
            this.btnYesNo.Location = new System.Drawing.Point(23, 301);
            this.btnYesNo.Name = "btnYesNo";
            this.btnYesNo.Size = new System.Drawing.Size(172, 85);
            this.btnYesNo.TabIndex = 3;
            this.btnYesNo.Text = "YES / NO";
            this.btnYesNo.UseVisualStyleBackColor = true;
            this.btnYesNo.Click += new System.EventHandler(this.btnYesNo_Click);
            // 
            // btnAbort
            // 
            this.btnAbort.Location = new System.Drawing.Point(23, 395);
            this.btnAbort.Name = "btnAbort";
            this.btnAbort.Size = new System.Drawing.Size(172, 85);
            this.btnAbort.TabIndex = 3;
            this.btnAbort.Text = "Abort / Retry / lgnore";
            this.btnAbort.UseVisualStyleBackColor = true;
            this.btnAbort.Click += new System.EventHandler(this.btnAbort_Click);
            // 
            // btnColorDialog
            // 
            this.btnColorDialog.Location = new System.Drawing.Point(240, 111);
            this.btnColorDialog.Name = "btnColorDialog";
            this.btnColorDialog.Size = new System.Drawing.Size(172, 85);
            this.btnColorDialog.TabIndex = 3;
            this.btnColorDialog.Text = "Color Dialog";
            this.btnColorDialog.UseVisualStyleBackColor = true;
            this.btnColorDialog.Click += new System.EventHandler(this.btnColorDialog_Click);
            // 
            // btnFontDialog
            // 
            this.btnFontDialog.Location = new System.Drawing.Point(240, 205);
            this.btnFontDialog.Name = "btnFontDialog";
            this.btnFontDialog.Size = new System.Drawing.Size(172, 85);
            this.btnFontDialog.TabIndex = 3;
            this.btnFontDialog.Text = "Font Dialog";
            this.btnFontDialog.UseVisualStyleBackColor = true;
            this.btnFontDialog.Click += new System.EventHandler(this.btnFontDialog_Click);
            // 
            // btnOpenFileDialog
            // 
            this.btnOpenFileDialog.Location = new System.Drawing.Point(240, 301);
            this.btnOpenFileDialog.Name = "btnOpenFileDialog";
            this.btnOpenFileDialog.Size = new System.Drawing.Size(172, 85);
            this.btnOpenFileDialog.TabIndex = 3;
            this.btnOpenFileDialog.Text = "OpenFileDialog";
            this.btnOpenFileDialog.UseVisualStyleBackColor = true;
            this.btnOpenFileDialog.Click += new System.EventHandler(this.btnOpenFileDialog_Click);
            // 
            // btnFolderBrowser
            // 
            this.btnFolderBrowser.Location = new System.Drawing.Point(240, 395);
            this.btnFolderBrowser.Name = "btnFolderBrowser";
            this.btnFolderBrowser.Size = new System.Drawing.Size(172, 85);
            this.btnFolderBrowser.TabIndex = 3;
            this.btnFolderBrowser.Text = "FolderBrowser";
            this.btnFolderBrowser.UseVisualStyleBackColor = true;
            this.btnFolderBrowser.Click += new System.EventHandler(this.btnFolderBrowser_Click);
            // 
            // btnPrintDialog
            // 
            this.btnPrintDialog.Location = new System.Drawing.Point(453, 111);
            this.btnPrintDialog.Name = "btnPrintDialog";
            this.btnPrintDialog.Size = new System.Drawing.Size(169, 85);
            this.btnPrintDialog.TabIndex = 3;
            this.btnPrintDialog.Text = "Print Dialog";
            this.btnPrintDialog.UseVisualStyleBackColor = true;
            this.btnPrintDialog.Click += new System.EventHandler(this.btnPrintDialog_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(450, 314);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(72, 15);
            this.label1.TabIndex = 4;
            this.label1.Text = "Parameter";
            // 
            // openFileDialog1
            // 
            this.openFileDialog1.FileName = "openFileDialog1";
            // 
            // printDialog1
            // 
            this.printDialog1.UseEXDialog = true;
            // 
            // UserDialogMain
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(657, 553);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.btnFolderBrowser);
            this.Controls.Add(this.btnAbort);
            this.Controls.Add(this.btnOpenFileDialog);
            this.Controls.Add(this.btnYesNo);
            this.Controls.Add(this.btnFontDialog);
            this.Controls.Add(this.btnOkCalcel);
            this.Controls.Add(this.btnPrintDialog);
            this.Controls.Add(this.btnColorDialog);
            this.Controls.Add(this.btnBasic);
            this.Controls.Add(this.txtMain);
            this.Controls.Add(this.txtParameter);
            this.Controls.Add(this.btnUser2);
            this.Controls.Add(this.btnUser1);
            this.Name = "UserDialogMain";
            this.Text = "사용자 정의 대화상자 프로그램";
            this.Load += new System.EventHandler(this.UserDialogMain_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button btnUser1;
        private System.Windows.Forms.Button btnUser2;
        private System.Windows.Forms.TextBox txtParameter;
        private System.Windows.Forms.TextBox txtMain;
        private System.Windows.Forms.Button btnBasic;
        private System.Windows.Forms.Button btnOkCalcel;
        private System.Windows.Forms.Button btnYesNo;
        private System.Windows.Forms.Button btnAbort;
        private System.Windows.Forms.Button btnColorDialog;
        private System.Windows.Forms.Button btnFontDialog;
        private System.Windows.Forms.Button btnOpenFileDialog;
        private System.Windows.Forms.Button btnFolderBrowser;
        private System.Windows.Forms.Button btnPrintDialog;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.ColorDialog colorDialog1;
        private System.Windows.Forms.FontDialog fontDialog1;
        private System.Windows.Forms.FolderBrowserDialog folderBrowserDialog1;
        private System.Windows.Forms.OpenFileDialog openFileDialog1;
        private System.Windows.Forms.PrintDialog printDialog1;
    }
}

