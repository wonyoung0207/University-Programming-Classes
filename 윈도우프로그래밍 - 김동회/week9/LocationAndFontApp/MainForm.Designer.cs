
namespace LocationAndFontApp
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
            this.lblHorse = new System.Windows.Forms.Label();
            this.btnup = new System.Windows.Forms.Button();
            this.btndown = new System.Windows.Forms.Button();
            this.btnD = new System.Windows.Forms.Button();
            this.btnL = new System.Windows.Forms.Button();
            this.btnR = new System.Windows.Forms.Button();
            this.btnOrigin = new System.Windows.Forms.Button();
            this.btnLD = new System.Windows.Forms.Button();
            this.btnLU = new System.Windows.Forms.Button();
            this.btnRD = new System.Windows.Forms.Button();
            this.btnU = new System.Windows.Forms.Button();
            this.btnRU = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // lblHorse
            // 
            this.lblHorse.BackColor = System.Drawing.SystemColors.ActiveCaption;
            this.lblHorse.Font = new System.Drawing.Font("굴림", 10.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.lblHorse.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.lblHorse.Location = new System.Drawing.Point(139, 94);
            this.lblHorse.Name = "lblHorse";
            this.lblHorse.Size = new System.Drawing.Size(184, 69);
            this.lblHorse.TabIndex = 0;
            this.lblHorse.Text = "움직이는 말";
            this.lblHorse.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // btnup
            // 
            this.btnup.Location = new System.Drawing.Point(395, 43);
            this.btnup.Name = "btnup";
            this.btnup.Size = new System.Drawing.Size(87, 33);
            this.btnup.TabIndex = 1;
            this.btnup.Text = "크게";
            this.btnup.UseVisualStyleBackColor = true;
            this.btnup.Click += new System.EventHandler(this.btnup_Click);
            // 
            // btndown
            // 
            this.btndown.Location = new System.Drawing.Point(395, 130);
            this.btndown.Name = "btndown";
            this.btndown.Size = new System.Drawing.Size(87, 33);
            this.btndown.TabIndex = 2;
            this.btndown.Text = "작게";
            this.btndown.UseVisualStyleBackColor = true;
            this.btndown.Click += new System.EventHandler(this.btndown_Click);
            // 
            // btnD
            // 
            this.btnD.Location = new System.Drawing.Point(179, 345);
            this.btnD.Name = "btnD";
            this.btnD.Size = new System.Drawing.Size(96, 39);
            this.btnD.TabIndex = 3;
            this.btnD.Text = "아래";
            this.btnD.UseVisualStyleBackColor = true;
            this.btnD.Click += new System.EventHandler(this.btnD_Click);
            // 
            // btnL
            // 
            this.btnL.Location = new System.Drawing.Point(47, 291);
            this.btnL.Name = "btnL";
            this.btnL.Size = new System.Drawing.Size(96, 39);
            this.btnL.TabIndex = 3;
            this.btnL.Text = "왼쪽";
            this.btnL.UseVisualStyleBackColor = true;
            this.btnL.Click += new System.EventHandler(this.btnL_Click);
            // 
            // btnR
            // 
            this.btnR.Location = new System.Drawing.Point(318, 291);
            this.btnR.Name = "btnR";
            this.btnR.Size = new System.Drawing.Size(96, 39);
            this.btnR.TabIndex = 3;
            this.btnR.Text = "오른쪽";
            this.btnR.UseVisualStyleBackColor = true;
            this.btnR.Click += new System.EventHandler(this.btnR_Click);
            // 
            // btnOrigin
            // 
            this.btnOrigin.Location = new System.Drawing.Point(179, 291);
            this.btnOrigin.Name = "btnOrigin";
            this.btnOrigin.Size = new System.Drawing.Size(96, 39);
            this.btnOrigin.TabIndex = 3;
            this.btnOrigin.Text = "처음위치";
            this.btnOrigin.UseVisualStyleBackColor = true;
            this.btnOrigin.Click += new System.EventHandler(this.btnOrigin_Click);
            // 
            // btnLD
            // 
            this.btnLD.Location = new System.Drawing.Point(47, 345);
            this.btnLD.Name = "btnLD";
            this.btnLD.Size = new System.Drawing.Size(96, 39);
            this.btnLD.TabIndex = 3;
            this.btnLD.Text = "왼쪽아래";
            this.btnLD.UseVisualStyleBackColor = true;
            this.btnLD.Click += new System.EventHandler(this.btnLD_Click);
            // 
            // btnLU
            // 
            this.btnLU.Location = new System.Drawing.Point(47, 233);
            this.btnLU.Name = "btnLU";
            this.btnLU.Size = new System.Drawing.Size(96, 39);
            this.btnLU.TabIndex = 3;
            this.btnLU.Text = "왼쪽위";
            this.btnLU.UseVisualStyleBackColor = true;
            this.btnLU.Click += new System.EventHandler(this.btnLU_Click);
            // 
            // btnRD
            // 
            this.btnRD.Location = new System.Drawing.Point(318, 345);
            this.btnRD.Name = "btnRD";
            this.btnRD.Size = new System.Drawing.Size(96, 39);
            this.btnRD.TabIndex = 3;
            this.btnRD.Text = "오른쪽아래";
            this.btnRD.UseVisualStyleBackColor = true;
            this.btnRD.Click += new System.EventHandler(this.btnRD_Click);
            // 
            // btnU
            // 
            this.btnU.Location = new System.Drawing.Point(179, 233);
            this.btnU.Name = "btnU";
            this.btnU.Size = new System.Drawing.Size(96, 39);
            this.btnU.TabIndex = 3;
            this.btnU.Text = "위";
            this.btnU.UseVisualStyleBackColor = true;
            this.btnU.Click += new System.EventHandler(this.btnU_Click);
            // 
            // btnRU
            // 
            this.btnRU.Location = new System.Drawing.Point(318, 233);
            this.btnRU.Name = "btnRU";
            this.btnRU.Size = new System.Drawing.Size(96, 39);
            this.btnRU.TabIndex = 3;
            this.btnRU.Text = "오른쪽위";
            this.btnRU.UseVisualStyleBackColor = true;
            this.btnRU.Click += new System.EventHandler(this.btnRU_Click);
            // 
            // MainForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.AutoSize = true;
            this.ClientSize = new System.Drawing.Size(519, 407);
            this.Controls.Add(this.btnRU);
            this.Controls.Add(this.btnRD);
            this.Controls.Add(this.btnR);
            this.Controls.Add(this.btnLU);
            this.Controls.Add(this.btnLD);
            this.Controls.Add(this.btnU);
            this.Controls.Add(this.btnL);
            this.Controls.Add(this.btnOrigin);
            this.Controls.Add(this.btnD);
            this.Controls.Add(this.btndown);
            this.Controls.Add(this.btnup);
            this.Controls.Add(this.lblHorse);
            this.Name = "MainForm";
            this.Text = "움직이는 말";
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Label lblHorse;
        private System.Windows.Forms.Button btnup;
        private System.Windows.Forms.Button btndown;
        private System.Windows.Forms.Button btnD;
        private System.Windows.Forms.Button btnL;
        private System.Windows.Forms.Button btnR;
        private System.Windows.Forms.Button btnOrigin;
        private System.Windows.Forms.Button btnLD;
        private System.Windows.Forms.Button btnLU;
        private System.Windows.Forms.Button btnRD;
        private System.Windows.Forms.Button btnU;
        private System.Windows.Forms.Button btnRU;
    }
}

