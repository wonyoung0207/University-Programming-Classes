
namespace WindowsFormsApp
{
    partial class InputForm
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
            this.lblname = new System.Windows.Forms.Label();
            this.lblage = new System.Windows.Forms.Label();
            this.lblbirth = new System.Windows.Forms.Label();
            this.btnSend = new System.Windows.Forms.Button();
            this.txtname = new System.Windows.Forms.TextBox();
            this.txtage = new System.Windows.Forms.TextBox();
            this.txtyear = new System.Windows.Forms.TextBox();
            this.txtMonth = new System.Windows.Forms.TextBox();
            this.txtDay = new System.Windows.Forms.TextBox();
            this.label4 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.grpgender = new System.Windows.Forms.GroupBox();
            this.grpFavorite = new System.Windows.Forms.GroupBox();
            this.rdoMan = new System.Windows.Forms.RadioButton();
            this.rdoWoman = new System.Windows.Forms.RadioButton();
            this.chkfishing = new System.Windows.Forms.CheckBox();
            this.chkGaming = new System.Windows.Forms.CheckBox();
            this.chkSinging = new System.Windows.Forms.CheckBox();
            this.grpgender.SuspendLayout();
            this.grpFavorite.SuspendLayout();
            this.SuspendLayout();
            // 
            // lblname
            // 
            this.lblname.AutoSize = true;
            this.lblname.Location = new System.Drawing.Point(30, 31);
            this.lblname.Name = "lblname";
            this.lblname.Size = new System.Drawing.Size(42, 15);
            this.lblname.TabIndex = 0;
            this.lblname.Text = "name";
            // 
            // lblage
            // 
            this.lblage.AutoSize = true;
            this.lblage.Location = new System.Drawing.Point(30, 96);
            this.lblage.Name = "lblage";
            this.lblage.Size = new System.Drawing.Size(31, 15);
            this.lblage.TabIndex = 0;
            this.lblage.Text = "age";
            // 
            // lblbirth
            // 
            this.lblbirth.AutoSize = true;
            this.lblbirth.Location = new System.Drawing.Point(27, 231);
            this.lblbirth.Name = "lblbirth";
            this.lblbirth.Size = new System.Drawing.Size(34, 15);
            this.lblbirth.TabIndex = 0;
            this.lblbirth.Text = "birth";
            // 
            // btnSend
            // 
            this.btnSend.Location = new System.Drawing.Point(131, 358);
            this.btnSend.Name = "btnSend";
            this.btnSend.Size = new System.Drawing.Size(100, 44);
            this.btnSend.TabIndex = 1;
            this.btnSend.Text = "Send";
            this.btnSend.UseVisualStyleBackColor = true;
            this.btnSend.Click += new System.EventHandler(this.btnSend_Click);
            // 
            // txtname
            // 
            this.txtname.Location = new System.Drawing.Point(88, 31);
            this.txtname.Name = "txtname";
            this.txtname.Size = new System.Drawing.Size(145, 25);
            this.txtname.TabIndex = 2;
            // 
            // txtage
            // 
            this.txtage.Location = new System.Drawing.Point(88, 93);
            this.txtage.Name = "txtage";
            this.txtage.Size = new System.Drawing.Size(145, 25);
            this.txtage.TabIndex = 2;
            // 
            // txtyear
            // 
            this.txtyear.Location = new System.Drawing.Point(69, 228);
            this.txtyear.Name = "txtyear";
            this.txtyear.Size = new System.Drawing.Size(100, 25);
            this.txtyear.TabIndex = 2;
            // 
            // txtMonth
            // 
            this.txtMonth.Location = new System.Drawing.Point(194, 228);
            this.txtMonth.Name = "txtMonth";
            this.txtMonth.Size = new System.Drawing.Size(39, 25);
            this.txtMonth.TabIndex = 2;
            // 
            // txtDay
            // 
            this.txtDay.Location = new System.Drawing.Point(258, 228);
            this.txtDay.Name = "txtDay";
            this.txtDay.Size = new System.Drawing.Size(39, 25);
            this.txtDay.TabIndex = 2;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(175, 231);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(13, 15);
            this.label4.TabIndex = 0;
            this.label4.Text = "/";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(239, 231);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(13, 15);
            this.label5.TabIndex = 0;
            this.label5.Text = "/";
            // 
            // grpgender
            // 
            this.grpgender.Controls.Add(this.rdoWoman);
            this.grpgender.Controls.Add(this.rdoMan);
            this.grpgender.Location = new System.Drawing.Point(29, 142);
            this.grpgender.Name = "grpgender";
            this.grpgender.Size = new System.Drawing.Size(249, 55);
            this.grpgender.TabIndex = 3;
            this.grpgender.TabStop = false;
            this.grpgender.Text = "gender";
            // 
            // grpFavorite
            // 
            this.grpFavorite.Controls.Add(this.chkSinging);
            this.grpFavorite.Controls.Add(this.chkGaming);
            this.grpFavorite.Controls.Add(this.chkfishing);
            this.grpFavorite.Location = new System.Drawing.Point(29, 286);
            this.grpFavorite.Name = "grpFavorite";
            this.grpFavorite.Size = new System.Drawing.Size(359, 55);
            this.grpFavorite.TabIndex = 3;
            this.grpFavorite.TabStop = false;
            this.grpFavorite.Text = "Favorite";
            // 
            // rdoMan
            // 
            this.rdoMan.AutoSize = true;
            this.rdoMan.Location = new System.Drawing.Point(22, 24);
            this.rdoMan.Name = "rdoMan";
            this.rdoMan.Size = new System.Drawing.Size(55, 19);
            this.rdoMan.TabIndex = 0;
            this.rdoMan.TabStop = true;
            this.rdoMan.Text = "man";
            this.rdoMan.UseVisualStyleBackColor = true;
            // 
            // rdoWoman
            // 
            this.rdoWoman.AutoSize = true;
            this.rdoWoman.Location = new System.Drawing.Point(120, 24);
            this.rdoWoman.Name = "rdoWoman";
            this.rdoWoman.Size = new System.Drawing.Size(78, 19);
            this.rdoWoman.TabIndex = 0;
            this.rdoWoman.TabStop = true;
            this.rdoWoman.Text = "Woman";
            this.rdoWoman.UseVisualStyleBackColor = true;
            // 
            // chkfishing
            // 
            this.chkfishing.AutoSize = true;
            this.chkfishing.Location = new System.Drawing.Point(0, 24);
            this.chkfishing.Name = "chkfishing";
            this.chkfishing.Size = new System.Drawing.Size(71, 19);
            this.chkfishing.TabIndex = 0;
            this.chkfishing.Text = "fishing";
            this.chkfishing.UseVisualStyleBackColor = true;
            // 
            // chkGaming
            // 
            this.chkGaming.AutoSize = true;
            this.chkGaming.Location = new System.Drawing.Point(110, 24);
            this.chkGaming.Name = "chkGaming";
            this.chkGaming.Size = new System.Drawing.Size(75, 19);
            this.chkGaming.TabIndex = 0;
            this.chkGaming.Text = "gaming";
            this.chkGaming.UseVisualStyleBackColor = true;
            // 
            // chkSinging
            // 
            this.chkSinging.AutoSize = true;
            this.chkSinging.Location = new System.Drawing.Point(220, 24);
            this.chkSinging.Name = "chkSinging";
            this.chkSinging.Size = new System.Drawing.Size(77, 19);
            this.chkSinging.TabIndex = 0;
            this.chkSinging.Text = "Singing";
            this.chkSinging.UseVisualStyleBackColor = true;
            // 
            // InputForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(397, 414);
            this.Controls.Add(this.grpFavorite);
            this.Controls.Add(this.grpgender);
            this.Controls.Add(this.txtDay);
            this.Controls.Add(this.txtMonth);
            this.Controls.Add(this.txtyear);
            this.Controls.Add(this.txtage);
            this.Controls.Add(this.txtname);
            this.Controls.Add(this.btnSend);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.lblbirth);
            this.Controls.Add(this.lblage);
            this.Controls.Add(this.lblname);
            this.Name = "InputForm";
            this.Text = "Input Form";
            this.grpgender.ResumeLayout(false);
            this.grpgender.PerformLayout();
            this.grpFavorite.ResumeLayout(false);
            this.grpFavorite.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lblname;
        private System.Windows.Forms.Label lblage;
        private System.Windows.Forms.Label lblbirth;
        private System.Windows.Forms.Button btnSend;
        private System.Windows.Forms.TextBox txtname;
        private System.Windows.Forms.TextBox txtage;
        private System.Windows.Forms.TextBox txtyear;
        private System.Windows.Forms.TextBox txtMonth;
        private System.Windows.Forms.TextBox txtDay;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.GroupBox grpgender;
        private System.Windows.Forms.RadioButton rdoWoman;
        private System.Windows.Forms.RadioButton rdoMan;
        private System.Windows.Forms.GroupBox grpFavorite;
        private System.Windows.Forms.CheckBox chkSinging;
        private System.Windows.Forms.CheckBox chkGaming;
        private System.Windows.Forms.CheckBox chkfishing;
    }
}

