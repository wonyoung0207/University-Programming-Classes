
namespace VolumeCalcProject
{
    partial class frmVolumCalc
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
            this.txtWidth = new System.Windows.Forms.TextBox();
            this.txtHight = new System.Windows.Forms.TextBox();
            this.txtDepth = new System.Windows.Forms.TextBox();
            this.txtVolume = new System.Windows.Forms.TextBox();
            this.btnCalc = new System.Windows.Forms.Button();
            this.lblWidth = new System.Windows.Forms.Label();
            this.lblHight = new System.Windows.Forms.Label();
            this.lblDepth = new System.Windows.Forms.Label();
            this.lblVolume = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // txtWidth
            // 
            this.txtWidth.Location = new System.Drawing.Point(91, 37);
            this.txtWidth.Name = "txtWidth";
            this.txtWidth.Size = new System.Drawing.Size(322, 25);
            this.txtWidth.TabIndex = 0;
            // 
            // txtHight
            // 
            this.txtHight.Location = new System.Drawing.Point(91, 105);
            this.txtHight.Name = "txtHight";
            this.txtHight.Size = new System.Drawing.Size(322, 25);
            this.txtHight.TabIndex = 1;
            // 
            // txtDepth
            // 
            this.txtDepth.Location = new System.Drawing.Point(91, 168);
            this.txtDepth.Name = "txtDepth";
            this.txtDepth.Size = new System.Drawing.Size(322, 25);
            this.txtDepth.TabIndex = 2;
            this.txtDepth.TextChanged += new System.EventHandler(this.textBox3_TextChanged);
            // 
            // txtVolume
            // 
            this.txtVolume.Location = new System.Drawing.Point(91, 250);
            this.txtVolume.Name = "txtVolume";
            this.txtVolume.Size = new System.Drawing.Size(322, 25);
            this.txtVolume.TabIndex = 3;
            this.txtVolume.TextChanged += new System.EventHandler(this.textBox4_TextChanged);
            // 
            // btnCalc
            // 
            this.btnCalc.Location = new System.Drawing.Point(171, 212);
            this.btnCalc.Name = "btnCalc";
            this.btnCalc.Size = new System.Drawing.Size(172, 23);
            this.btnCalc.TabIndex = 4;
            this.btnCalc.Text = "계산하기";
            this.btnCalc.UseVisualStyleBackColor = true;
            this.btnCalc.Click += new System.EventHandler(this.btnCalc_Click);
            // 
            // lblWidth
            // 
            this.lblWidth.AutoSize = true;
            this.lblWidth.Location = new System.Drawing.Point(35, 40);
            this.lblWidth.Name = "lblWidth";
            this.lblWidth.Size = new System.Drawing.Size(37, 15);
            this.lblWidth.TabIndex = 5;
            this.lblWidth.Text = "너비";
            // 
            // lblHight
            // 
            this.lblHight.AutoSize = true;
            this.lblHight.Location = new System.Drawing.Point(35, 108);
            this.lblHight.Name = "lblHight";
            this.lblHight.Size = new System.Drawing.Size(37, 15);
            this.lblHight.TabIndex = 6;
            this.lblHight.Text = "높이";
            // 
            // lblDepth
            // 
            this.lblDepth.AutoSize = true;
            this.lblDepth.Location = new System.Drawing.Point(35, 171);
            this.lblDepth.Name = "lblDepth";
            this.lblDepth.Size = new System.Drawing.Size(37, 15);
            this.lblDepth.TabIndex = 7;
            this.lblDepth.Text = "깊이";
            // 
            // lblVolume
            // 
            this.lblVolume.AutoSize = true;
            this.lblVolume.Location = new System.Drawing.Point(38, 259);
            this.lblVolume.Name = "lblVolume";
            this.lblVolume.Size = new System.Drawing.Size(37, 15);
            this.lblVolume.TabIndex = 8;
            this.lblVolume.Text = "부피";
            // 
            // frmVolumCalc
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(462, 306);
            this.Controls.Add(this.lblVolume);
            this.Controls.Add(this.lblDepth);
            this.Controls.Add(this.lblHight);
            this.Controls.Add(this.lblWidth);
            this.Controls.Add(this.btnCalc);
            this.Controls.Add(this.txtVolume);
            this.Controls.Add(this.txtDepth);
            this.Controls.Add(this.txtHight);
            this.Controls.Add(this.txtWidth);
            this.Name = "frmVolumCalc";
            this.Text = "부피계산기";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox txtWidth;
        private System.Windows.Forms.TextBox txtHight;
        private System.Windows.Forms.TextBox txtDepth;
        private System.Windows.Forms.TextBox txtVolume;
        private System.Windows.Forms.Button btnCalc;
        private System.Windows.Forms.Label lblWidth;
        private System.Windows.Forms.Label lblHight;
        private System.Windows.Forms.Label lblDepth;
        private System.Windows.Forms.Label lblVolume;
    }
}

