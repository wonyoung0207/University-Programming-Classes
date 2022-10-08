
namespace DialogApp
{
    partial class UserDialog1Form
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.lblParmeter = new System.Windows.Forms.Label();
            this.txtParameter = new System.Windows.Forms.TextBox();
            this.btnClose = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // lblParmeter
            // 
            this.lblParmeter.AutoSize = true;
            this.lblParmeter.Location = new System.Drawing.Point(28, 32);
            this.lblParmeter.Name = "lblParmeter";
            this.lblParmeter.Size = new System.Drawing.Size(87, 15);
            this.lblParmeter.TabIndex = 0;
            this.lblParmeter.Text = "전달받은 값";
            // 
            // txtParameter
            // 
            this.txtParameter.Location = new System.Drawing.Point(133, 22);
            this.txtParameter.Name = "txtParameter";
            this.txtParameter.Size = new System.Drawing.Size(100, 25);
            this.txtParameter.TabIndex = 1;
            // 
            // btnClose
            // 
            this.btnClose.Location = new System.Drawing.Point(66, 95);
            this.btnClose.Name = "btnClose";
            this.btnClose.Size = new System.Drawing.Size(140, 37);
            this.btnClose.TabIndex = 2;
            this.btnClose.Text = "Close";
            this.btnClose.UseVisualStyleBackColor = true;
            this.btnClose.Click += new System.EventHandler(this.btnClose_Click);
            // 
            // UserDialog1Form
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(279, 176);
            this.Controls.Add(this.btnClose);
            this.Controls.Add(this.txtParameter);
            this.Controls.Add(this.lblParmeter);
            this.Name = "UserDialog1Form";
            this.Text = "전달 받은 값을 표현하는 폼";
            this.Load += new System.EventHandler(this.UserDialog1Form_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lblParmeter;
        private System.Windows.Forms.TextBox txtParameter;
        private System.Windows.Forms.Button btnClose;
    }
}