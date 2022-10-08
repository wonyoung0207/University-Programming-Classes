
namespace PointerExam
{
    partial class PointForm
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
            this.txtX = new System.Windows.Forms.TextBox();
            this.txtY = new System.Windows.Forms.TextBox();
            this.lblX = new System.Windows.Forms.Label();
            this.lblY = new System.Windows.Forms.Label();
            this.btnPrint = new System.Windows.Forms.Button();
            this.txtResult = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this.btnMoveTo = new System.Windows.Forms.Button();
            this.btnPlus = new System.Windows.Forms.Button();
            this.txtX2 = new System.Windows.Forms.TextBox();
            this.txtY2 = new System.Windows.Forms.TextBox();
            this.btnMoveBy = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // txtX
            // 
            this.txtX.Location = new System.Drawing.Point(111, 41);
            this.txtX.Name = "txtX";
            this.txtX.Size = new System.Drawing.Size(179, 25);
            this.txtX.TabIndex = 0;
            // 
            // txtY
            // 
            this.txtY.Location = new System.Drawing.Point(111, 113);
            this.txtY.Name = "txtY";
            this.txtY.Size = new System.Drawing.Size(179, 25);
            this.txtY.TabIndex = 0;
            // 
            // lblX
            // 
            this.lblX.AutoSize = true;
            this.lblX.Location = new System.Drawing.Point(46, 51);
            this.lblX.Name = "lblX";
            this.lblX.Size = new System.Drawing.Size(31, 15);
            this.lblX.TabIndex = 1;
            this.lblX.Text = "X값";
            // 
            // lblY
            // 
            this.lblY.AutoSize = true;
            this.lblY.Location = new System.Drawing.Point(46, 110);
            this.lblY.Name = "lblY";
            this.lblY.Size = new System.Drawing.Size(30, 15);
            this.lblY.TabIndex = 1;
            this.lblY.Text = "Y값";
            this.lblY.Click += new System.EventHandler(this.label2_Click);
            // 
            // btnPrint
            // 
            this.btnPrint.Location = new System.Drawing.Point(72, 182);
            this.btnPrint.Name = "btnPrint";
            this.btnPrint.Size = new System.Drawing.Size(79, 23);
            this.btnPrint.TabIndex = 2;
            this.btnPrint.Text = "객체생성";
            this.btnPrint.UseVisualStyleBackColor = true;
            this.btnPrint.Click += new System.EventHandler(this.btnPrint_Click);
            // 
            // txtResult
            // 
            this.txtResult.Location = new System.Drawing.Point(111, 228);
            this.txtResult.Multiline = true;
            this.txtResult.Name = "txtResult";
            this.txtResult.Size = new System.Drawing.Size(368, 111);
            this.txtResult.TabIndex = 0;
            this.txtResult.UseWaitCursor = true;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(40, 281);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(37, 15);
            this.label3.TabIndex = 1;
            this.label3.Text = "결과";
            this.label3.Click += new System.EventHandler(this.label2_Click);
            // 
            // btnMoveTo
            // 
            this.btnMoveTo.Location = new System.Drawing.Point(196, 182);
            this.btnMoveTo.Name = "btnMoveTo";
            this.btnMoveTo.Size = new System.Drawing.Size(75, 23);
            this.btnMoveTo.TabIndex = 3;
            this.btnMoveTo.Text = "객체이동";
            this.btnMoveTo.UseVisualStyleBackColor = true;
            this.btnMoveTo.Click += new System.EventHandler(this.btnMoveTo_Click);
            // 
            // btnPlus
            // 
            this.btnPlus.Location = new System.Drawing.Point(434, 182);
            this.btnPlus.Name = "btnPlus";
            this.btnPlus.Size = new System.Drawing.Size(85, 23);
            this.btnPlus.TabIndex = 4;
            this.btnPlus.Text = "더하기";
            this.btnPlus.UseVisualStyleBackColor = true;
            this.btnPlus.Click += new System.EventHandler(this.btnPlus_Click);
            // 
            // txtX2
            // 
            this.txtX2.Location = new System.Drawing.Point(381, 41);
            this.txtX2.Name = "txtX2";
            this.txtX2.Size = new System.Drawing.Size(180, 25);
            this.txtX2.TabIndex = 0;
            // 
            // txtY2
            // 
            this.txtY2.Location = new System.Drawing.Point(381, 113);
            this.txtY2.Name = "txtY2";
            this.txtY2.Size = new System.Drawing.Size(180, 25);
            this.txtY2.TabIndex = 0;
            // 
            // btnMoveBy
            // 
            this.btnMoveBy.Location = new System.Drawing.Point(316, 182);
            this.btnMoveBy.Name = "btnMoveBy";
            this.btnMoveBy.Size = new System.Drawing.Size(75, 23);
            this.btnMoveBy.TabIndex = 5;
            this.btnMoveBy.Text = "좌표이동";
            this.btnMoveBy.UseVisualStyleBackColor = true;
            this.btnMoveBy.Click += new System.EventHandler(this.btnMoveBy_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(340, 51);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(39, 15);
            this.label1.TabIndex = 1;
            this.label1.Text = "X2값";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(340, 110);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(38, 15);
            this.label2.TabIndex = 1;
            this.label2.Text = "Y2값";
            this.label2.Click += new System.EventHandler(this.label2_Click);
            // 
            // PointForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(647, 375);
            this.Controls.Add(this.btnMoveBy);
            this.Controls.Add(this.btnPlus);
            this.Controls.Add(this.btnMoveTo);
            this.Controls.Add(this.btnPrint);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.lblY);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.lblX);
            this.Controls.Add(this.txtResult);
            this.Controls.Add(this.txtY2);
            this.Controls.Add(this.txtX2);
            this.Controls.Add(this.txtY);
            this.Controls.Add(this.txtX);
            this.Name = "PointForm";
            this.Text = "PointEx";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox txtX;
        private System.Windows.Forms.TextBox txtY;
        private System.Windows.Forms.Label lblX;
        private System.Windows.Forms.Label lblY;
        private System.Windows.Forms.Button btnPrint;
        private System.Windows.Forms.TextBox txtResult;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Button btnMoveTo;
        private System.Windows.Forms.Button btnPlus;
        private System.Windows.Forms.TextBox txtX2;
        private System.Windows.Forms.TextBox txtY2;
        private System.Windows.Forms.Button btnMoveBy;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
    }
}

