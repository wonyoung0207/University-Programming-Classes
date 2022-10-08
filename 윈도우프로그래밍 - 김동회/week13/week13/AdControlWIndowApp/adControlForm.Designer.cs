
namespace AdControlWIndowApp
{
    partial class adControlForm
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
            this.components = new System.ComponentModel.Container();
            this.nUpDown = new System.Windows.Forms.NumericUpDown();
            this.tvValue = new System.Windows.Forms.TrackBar();
            this.progress = new System.Windows.Forms.ProgressBar();
            this.btnStart = new System.Windows.Forms.Button();
            this.timer1 = new System.Windows.Forms.Timer(this.components);
            ((System.ComponentModel.ISupportInitialize)(this.nUpDown)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.tvValue)).BeginInit();
            this.SuspendLayout();
            // 
            // nUpDown
            // 
            this.nUpDown.Location = new System.Drawing.Point(24, 21);
            this.nUpDown.Name = "nUpDown";
            this.nUpDown.Size = new System.Drawing.Size(158, 25);
            this.nUpDown.TabIndex = 0;
            this.nUpDown.ValueChanged += new System.EventHandler(this.nUpDown_ValueChanged);
            // 
            // tvValue
            // 
            this.tvValue.LargeChange = 20;
            this.tvValue.Location = new System.Drawing.Point(241, 21);
            this.tvValue.Maximum = 100;
            this.tvValue.Name = "tvValue";
            this.tvValue.Size = new System.Drawing.Size(250, 56);
            this.tvValue.SmallChange = 5;
            this.tvValue.TabIndex = 1;
            this.tvValue.Scroll += new System.EventHandler(this.tvValue_Scroll);
            // 
            // progress
            // 
            this.progress.Location = new System.Drawing.Point(24, 83);
            this.progress.Name = "progress";
            this.progress.Size = new System.Drawing.Size(467, 23);
            this.progress.TabIndex = 2;
            // 
            // btnStart
            // 
            this.btnStart.Location = new System.Drawing.Point(24, 145);
            this.btnStart.Name = "btnStart";
            this.btnStart.Size = new System.Drawing.Size(106, 39);
            this.btnStart.TabIndex = 3;
            this.btnStart.Text = "Start";
            this.btnStart.UseVisualStyleBackColor = true;
            this.btnStart.Click += new System.EventHandler(this.btnStart_Click);
            // 
            // timer1
            // 
            this.timer1.Interval = 1000;
            this.timer1.Tick += new System.EventHandler(this.timer1_Tick);
            // 
            // adControlForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(522, 255);
            this.Controls.Add(this.btnStart);
            this.Controls.Add(this.progress);
            this.Controls.Add(this.tvValue);
            this.Controls.Add(this.nUpDown);
            this.Name = "adControlForm";
            this.Text = "AdControlApp";
            ((System.ComponentModel.ISupportInitialize)(this.nUpDown)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.tvValue)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion
        private System.Windows.Forms.TrackBar tvValue;
        public System.Windows.Forms.NumericUpDown nUpDown;
        private System.Windows.Forms.ProgressBar progress;
        private System.Windows.Forms.Button btnStart;
        private System.Windows.Forms.Timer timer1;
    }
}

