
namespace WindowsForms
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
            this.lblTitle = new System.Windows.Forms.Label();
            this.blbLocation = new System.Windows.Forms.Label();
            this.lblFormBorder = new System.Windows.Forms.Label();
            this.lblX = new System.Windows.Forms.Label();
            this.lblY = new System.Windows.Forms.Label();
            this.lblOpacity = new System.Windows.Forms.Label();
            this.lblSize = new System.Windows.Forms.Label();
            this.lblWidth = new System.Windows.Forms.Label();
            this.lblHight = new System.Windows.Forms.Label();
            this.txtTitle = new System.Windows.Forms.TextBox();
            this.txtX = new System.Windows.Forms.TextBox();
            this.txtY = new System.Windows.Forms.TextBox();
            this.txtWidth = new System.Windows.Forms.TextBox();
            this.txtHeight = new System.Windows.Forms.TextBox();
            this.txtOpacity = new System.Windows.Forms.TextBox();
            this.btnCreateForm = new System.Windows.Forms.Button();
            this.panel1 = new System.Windows.Forms.Panel();
            this.rdoNone = new System.Windows.Forms.RadioButton();
            this.rdoSingle = new System.Windows.Forms.RadioButton();
            this.rdoFixed = new System.Windows.Forms.RadioButton();
            this.panel1.SuspendLayout();
            this.SuspendLayout();
            // 
            // lblTitle
            // 
            this.lblTitle.AutoSize = true;
            this.lblTitle.Location = new System.Drawing.Point(12, 46);
            this.lblTitle.Name = "lblTitle";
            this.lblTitle.Size = new System.Drawing.Size(86, 15);
            this.lblTitle.TabIndex = 0;
            this.lblTitle.Text = "Window title";
            // 
            // blbLocation
            // 
            this.blbLocation.AutoSize = true;
            this.blbLocation.Location = new System.Drawing.Point(10, 122);
            this.blbLocation.Name = "blbLocation";
            this.blbLocation.Size = new System.Drawing.Size(116, 15);
            this.blbLocation.TabIndex = 0;
            this.blbLocation.Text = "Window location";
            // 
            // lblFormBorder
            // 
            this.lblFormBorder.AutoSize = true;
            this.lblFormBorder.Location = new System.Drawing.Point(10, 182);
            this.lblFormBorder.Name = "lblFormBorder";
            this.lblFormBorder.Size = new System.Drawing.Size(115, 15);
            this.lblFormBorder.TabIndex = 0;
            this.lblFormBorder.Text = "FormBorderStyle";
            // 
            // lblX
            // 
            this.lblX.AutoSize = true;
            this.lblX.Location = new System.Drawing.Point(162, 93);
            this.lblX.Name = "lblX";
            this.lblX.Size = new System.Drawing.Size(16, 15);
            this.lblX.TabIndex = 0;
            this.lblX.Text = "x";
            // 
            // lblY
            // 
            this.lblY.AutoSize = true;
            this.lblY.Location = new System.Drawing.Point(254, 93);
            this.lblY.Name = "lblY";
            this.lblY.Size = new System.Drawing.Size(15, 15);
            this.lblY.TabIndex = 0;
            this.lblY.Text = "y";
            // 
            // lblOpacity
            // 
            this.lblOpacity.AutoSize = true;
            this.lblOpacity.Location = new System.Drawing.Point(16, 317);
            this.lblOpacity.Name = "lblOpacity";
            this.lblOpacity.Size = new System.Drawing.Size(58, 15);
            this.lblOpacity.TabIndex = 0;
            this.lblOpacity.Text = "Opacity";
            // 
            // lblSize
            // 
            this.lblSize.AutoSize = true;
            this.lblSize.Location = new System.Drawing.Point(339, 125);
            this.lblSize.Name = "lblSize";
            this.lblSize.Size = new System.Drawing.Size(93, 15);
            this.lblSize.TabIndex = 0;
            this.lblSize.Text = "Window Size";
            // 
            // lblWidth
            // 
            this.lblWidth.AutoSize = true;
            this.lblWidth.Location = new System.Drawing.Point(466, 83);
            this.lblWidth.Name = "lblWidth";
            this.lblWidth.Size = new System.Drawing.Size(40, 15);
            this.lblWidth.TabIndex = 0;
            this.lblWidth.Text = "width";
            // 
            // lblHight
            // 
            this.lblHight.AutoSize = true;
            this.lblHight.Location = new System.Drawing.Point(568, 83);
            this.lblHight.Name = "lblHight";
            this.lblHight.Size = new System.Drawing.Size(46, 15);
            this.lblHight.TabIndex = 0;
            this.lblHight.Text = "height";
            // 
            // txtTitle
            // 
            this.txtTitle.Location = new System.Drawing.Point(125, 43);
            this.txtTitle.Name = "txtTitle";
            this.txtTitle.Size = new System.Drawing.Size(296, 25);
            this.txtTitle.TabIndex = 1;
            // 
            // txtX
            // 
            this.txtX.Location = new System.Drawing.Point(133, 122);
            this.txtX.Name = "txtX";
            this.txtX.Size = new System.Drawing.Size(69, 25);
            this.txtX.TabIndex = 1;
            // 
            // txtY
            // 
            this.txtY.Location = new System.Drawing.Point(221, 122);
            this.txtY.Name = "txtY";
            this.txtY.Size = new System.Drawing.Size(69, 25);
            this.txtY.TabIndex = 1;
            // 
            // txtWidth
            // 
            this.txtWidth.Location = new System.Drawing.Point(455, 122);
            this.txtWidth.Name = "txtWidth";
            this.txtWidth.Size = new System.Drawing.Size(69, 25);
            this.txtWidth.TabIndex = 1;
            // 
            // txtHeight
            // 
            this.txtHeight.Location = new System.Drawing.Point(558, 122);
            this.txtHeight.Name = "txtHeight";
            this.txtHeight.Size = new System.Drawing.Size(69, 25);
            this.txtHeight.TabIndex = 1;
            // 
            // txtOpacity
            // 
            this.txtOpacity.Location = new System.Drawing.Point(96, 314);
            this.txtOpacity.Name = "txtOpacity";
            this.txtOpacity.Size = new System.Drawing.Size(296, 25);
            this.txtOpacity.TabIndex = 1;
            // 
            // btnCreateForm
            // 
            this.btnCreateForm.Location = new System.Drawing.Point(244, 362);
            this.btnCreateForm.Name = "btnCreateForm";
            this.btnCreateForm.Size = new System.Drawing.Size(177, 40);
            this.btnCreateForm.TabIndex = 2;
            this.btnCreateForm.Text = "Create Form";
            this.btnCreateForm.UseVisualStyleBackColor = true;
            this.btnCreateForm.Click += new System.EventHandler(this.btnCreateForm_Click);
            // 
            // panel1
            // 
            this.panel1.Controls.Add(this.rdoFixed);
            this.panel1.Controls.Add(this.rdoSingle);
            this.panel1.Controls.Add(this.rdoNone);
            this.panel1.Location = new System.Drawing.Point(143, 182);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(182, 117);
            this.panel1.TabIndex = 3;
            // 
            // rdoNone
            // 
            this.rdoNone.AutoSize = true;
            this.rdoNone.Location = new System.Drawing.Point(3, 3);
            this.rdoNone.Name = "rdoNone";
            this.rdoNone.Size = new System.Drawing.Size(62, 19);
            this.rdoNone.TabIndex = 0;
            this.rdoNone.TabStop = true;
            this.rdoNone.Text = "None";
            this.rdoNone.UseVisualStyleBackColor = true;
            // 
            // rdoSingle
            // 
            this.rdoSingle.AutoSize = true;
            this.rdoSingle.Location = new System.Drawing.Point(0, 39);
            this.rdoSingle.Name = "rdoSingle";
            this.rdoSingle.Size = new System.Drawing.Size(68, 19);
            this.rdoSingle.TabIndex = 0;
            this.rdoSingle.TabStop = true;
            this.rdoSingle.Text = "Single";
            this.rdoSingle.UseVisualStyleBackColor = true;
            // 
            // rdoFixed
            // 
            this.rdoFixed.AutoSize = true;
            this.rdoFixed.Location = new System.Drawing.Point(3, 78);
            this.rdoFixed.Name = "rdoFixed";
            this.rdoFixed.Size = new System.Drawing.Size(145, 19);
            this.rdoFixed.TabIndex = 0;
            this.rdoFixed.TabStop = true;
            this.rdoFixed.Text = "FixedToolWindow";
            this.rdoFixed.UseVisualStyleBackColor = true;
            // 
            // MainForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(665, 414);
            this.Controls.Add(this.panel1);
            this.Controls.Add(this.btnCreateForm);
            this.Controls.Add(this.txtHeight);
            this.Controls.Add(this.txtY);
            this.Controls.Add(this.txtWidth);
            this.Controls.Add(this.txtX);
            this.Controls.Add(this.txtOpacity);
            this.Controls.Add(this.txtTitle);
            this.Controls.Add(this.lblSize);
            this.Controls.Add(this.lblHight);
            this.Controls.Add(this.lblY);
            this.Controls.Add(this.lblWidth);
            this.Controls.Add(this.lblOpacity);
            this.Controls.Add(this.lblX);
            this.Controls.Add(this.lblFormBorder);
            this.Controls.Add(this.blbLocation);
            this.Controls.Add(this.lblTitle);
            this.Name = "MainForm";
            this.Text = "MainForm";
            this.panel1.ResumeLayout(false);
            this.panel1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lblTitle;
        private System.Windows.Forms.Label blbLocation;
        private System.Windows.Forms.Label lblFormBorder;
        private System.Windows.Forms.Label lblX;
        private System.Windows.Forms.Label lblY;
        private System.Windows.Forms.Label lblOpacity;
        private System.Windows.Forms.Label lblSize;
        private System.Windows.Forms.Label lblWidth;
        private System.Windows.Forms.Label lblHight;
        private System.Windows.Forms.TextBox txtTitle;
        private System.Windows.Forms.TextBox txtX;
        private System.Windows.Forms.TextBox txtY;
        private System.Windows.Forms.TextBox txtWidth;
        private System.Windows.Forms.TextBox txtHeight;
        private System.Windows.Forms.TextBox txtOpacity;
        private System.Windows.Forms.Button btnCreateForm;
        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.RadioButton rdoFixed;
        private System.Windows.Forms.RadioButton rdoSingle;
        private System.Windows.Forms.RadioButton rdoNone;
    }
}

