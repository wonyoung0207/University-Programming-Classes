

create table book_main(
	num int not null,
	book_type varchar(50) not null,
	book_title varchar(150) not null,
	book_author varchar(50) not null,
	book_publish varchar(50) not null,
	book_start varchar(50) not null,
	book_end varchar(50) not null,
	primary key(num)
);


drop table test;
drop table book_main;

show tables;

delete from book_main;

select * from book_main;

LOAD DATA INFILE '�缭��õ����_realData.csv' INTO TABLE book_main FIELDS TERMINATED BY ',';

LOAD DATA INFILE 'C:\Users\82102\Desktop\�缭��õ���� ���\�缭��õ����_realData.csv' INTO TABLE book_main FIELDS TERMINATED BY ',';

LOAD DATA LOCAL INFILE 'C:\Users\82102\Desktop\�缭��õ���� ���\�缭��õ����_realData.csv' INTO TABLE book_main;

LOAD DATA INFILE '�缭��õ����_realData.csv'
INTO TABLE book_main
FIELDS TERMINATED BY ','

//�ڿ�����

insert into book_main value(1168,'�ڿ�����','���� �� �̸��� �̷��� ������? : ���������� �������� �츮�� ������ �߻��� ���̾߱�','����ī�� �ƶ���','����','2020','2021.4');

insert into book_main value(1165,'�ڿ�����','������� ��ȭ : ���ݼ����� �ùΰ��б���','ȫ���� ����','�迵��','2020','2021.4');

insert into book_main value(1161,'�ڿ�����','���� �ٴ�Ҽ��� �ŴҴ�','��ҿ�','���ũ','2020','2021.2');

insert into book_main value(1156,'�ڿ�����','�ְ��� �����ڰ� ����� ������','�̾� ��Ʃ��Ʈ','�ݴ�','2020','2021.2');

insert into book_main value(1151,'�ڿ�����','���ָ� ������ : ���� �������� ������ ������','�����','Ư���Ѽ���','2020','2021.1');

insert into book_main value(1148,'�ڿ�����','����� ������ �Ǵ� ���� : �ô븦 �ռ��� SF�� ���� ���� �̾߱�','���� ����','���','2020','2021.1');

insert into book_main value(1143,'�ڿ�����','���踦 ������ �Ĺ���','��Ƽ�� �ظ��� ����','���質��','2020','2020.12');

insert into book_main value(1142,'�ڿ�����','�������� �����ϴ� �� : �ϻ��� ��� ���� ������ ��� �ּ��� ������ ���°� ','ŰƮ ������ ���� ','���������Ͽ콺','2020','2020.12');

insert into book_main value(1135,'�ڿ�����','�������� ������','�������� ����ó| �븣����Ʈ �츣���ں���','The Nan(�����������׷�)','2020','2020.11');

insert into book_main value(1134,'�ڿ�����','������ ������' ,'���� ĵ��','RHK(�˿���ġ�ڸ���)','2020','2020.11');



delete from book_main;

select * from book_main;

//�ι�����

insert into book_main value(1164,'�ι�����','������ ������ : ������ ��ȭ�� ����� ����� �ൿ ����','BJ ����','�帧����','2020','2021.4');

insert into book_main value(1158,'�ι�����','����| ������ ������� ���','����ö','�Ű�����Ź���','2020','2021.2');

insert into book_main value(1157,'�ι�����','ö������ ���Ǽ���| C#','�ִ�ȯ','å���','2020','2021.2');

insert into book_main value(1153,'�ι�����','���۰� ���� ����','���̻�','�ݴ�','2020','2021.1');

insert into book_main value(1150,'�ι�����','�Ƿ�����| �� å�� �ñ��մϴ�','�̼���','������','2020','2021.1');

insert into book_main value(1146,'�ι�����','���Ž� : �� �λ��� �ٲٴ� ��','������ ����','�̵� ','2020','2020.12');

insert into book_main value(1145,'�ι�����','���õ� �̻��� ��� ������ ��������ϴ�','������','��������','2020','2020.12');

insert into book_main value(1138,'�ι�����','(1�� 1������| ���󿡼� ���� ª��) ���� ���� 365.�ι��� ','���̺�� S. Ű��| ��� D. ��������','������Ͽ콺','2020','2020.11');

insert into book_main value(1133,'�ι�����','�� ������ ���| �Ƴ��� �ι���','������','EBS Books','2020','2020.11');

insert into book_main value(1132,'�ι�����','�Ҹ��� ö�� ����','����','������ö��','2020','2020.11');






delete from book_main;

select * from book_main;

//��ȸ����

insert into book_main value(1167,'��ȸ����','����� �������','�ʸ��� ��˵ڸ�| ���� ���','�������ǻ�','2020','2021.4');

insert into book_main value(1163,'��ȸ����','��ũ�缭���� : ������ ��� ','�����Ĵ� K. ����','����Ͻ���','2020','2021.4');

insert into book_main value(1160,'��ȸ����','����Ʈ ����','��Ͼ� ���ں���','����','2020','2021.2');

insert into book_main value(1159,'��ȸ����','���Ļ�','�ֿ���','�޸ӴϽ�Ʈ','2020','2021.2');

insert into book_main value(1155,'��ȸ����','���Ŀ��� ����ũ�� ������ �ϳ���','�Ӽ���','�����ǽ�','2020','2021.1');

insert into book_main value(1152,'��ȸ����','���� ����| ��Ż�Ѱ���?','����ȣ ','��Ʈ����','2020','2021.1');

insert into book_main value(1144,'��ȸ����','������ �����̹���','��ȥ�������̽Ź� �����Ͱ��� �����','�ӽ�Ʈ�����','2020','2020.12');

insert into book_main value(1140,'��ȸ����','�ð��� ���� ��','������ ����','����','2020','2020.12');

insert into book_main value(1139,'��ȸ����','���� �ð��� �ȴ�','�輼��| ���̶� ','��������','2020','2020.11');

insert into book_main value(1136,'��ȸ����','(�˾Ƶθ� �����ִ� �Ź���) ������Ȱ ���̵� ','�����','����','2020','2020.11');






delete from book_main;

select * from book_main;

//����

insert into book_main value(1166,'����','���� ���','�輱��','�ٻ�å��','2020','2021.4');

insert into book_main value(1162,'����','��ſ��� �Ͻ� ������ �����մϴ�','������','��ȭ��','2020','2021.2');

insert into book_main value(1154,'����','���ټ� ���� ��','�ӵ巹 �˷��ý�','�߻ߺϽ�','2020','2021.1');

insert into book_main value(1149,'����','���뺼','�ڼҿ�','â��','2020','2021.1');

insert into book_main value(1147,'����','��Ҹ��� ��Ų ����','�ĸ����� �����','�Ϸ�����','2020','2020.12');

insert into book_main value(1141,'����','õ���� �Ķ�','õ����','���','2020','2020.12');

insert into book_main value(1137,'����','�����ʾ� �̺��Դϴ�','������Ű �Ƹ���','�س����ǻ�','2020','2020.11');

insert into book_main value(1131,'����','���õ� ��鸮�� ���Դϴ�','���翵','�帧����','2020','2020.11');

insert into book_main value(1128,'����','����� 4�� 33��','�̼��� ','���೪��','2020','2020.10');

insert into book_main value(1124,'����','��� �������','�� ������Ÿ�� ','�ܾ���Ŀ��','2020','2020.10');





// �������� å ��õ 

delete from book_kyobo where book_type="����";

select * from book_kyobo;

create table book_kyobo(
	book_type varchar(50) not null,
	book_title varchar(150) not null,
	book_author varchar(50) not null,
	book_publish varchar(50) not null
);

//����

insert into book_kyobo value('����','�޷���Ʈ �� ��ȭ��','�̹̿�','�ϴ�');

insert into book_kyobo value('����','�丮�ڸ� ����','�븮��Ű ��Ÿ�� ����','���');

insert into book_kyobo value('����','��Ž���� ���� 1�� �߸�','���ø� ����','�����Ŀ��Ʈ');

insert into book_kyobo value('����','���̾�','�츣�� �켼 ����','��Ÿ�Ͻ�');

insert into book_kyobo value('����','�����Ͽ콺','�� ��Ʈ ����','�Ϸε�');



// �ڿ�����

insert into book_kyobo value('�ڿ�����','�ð��� �帣�� �ʴ´�','ī���� �κ��� ����','�ܾ���Ŀ��');

insert into book_kyobo value('�ڿ�����','�˾Ƶθ� ���� �ִ� ���� ���л��','�̿�ȣ ����','�Ҵ��Ͻ�');

insert into book_kyobo value('�ڿ�����','����Ʈ �ڷγ� �ϻ��� �̷�','���б����å������ ����','û������');

insert into book_kyobo value('�ڿ�����','�Ƴ��� ���ڷ� ������ ����','�ø��� ���� ����','�˸�');

insert into book_kyobo value('�ڿ�����','�κ� �ô� ���ڸ��� �̷�','���̽� ��Ŀ ����','�̵�');




// �ι�����

insert into book_kyobo value('�ι�����','������Ż�� ���� �ɸ�å','����ø� ������ ����','������');

insert into book_kyobo value('�ι�����','���� ����� ���� �ߴ�','������ ����','��Ʃ������帮');

insert into book_kyobo value('�ι�����','�˾Ƶθ� �� �� �ִ� �� ���л��','�½��丮������ ����','�½��丮');

insert into book_kyobo value('�ι�����','��ȭ�� ����','���̺�� ��Ŭ����','��Ű');

insert into book_kyobo value('�ι�����','���� �� �������� �ұ�?','�̽��϶� ������ ����','�ʸ�');




//��ȸ����

insert into book_kyobo value('��ȸ����','���ο� ������ �´�','�踸��','���');

insert into book_kyobo value('��ȸ����','��Ʈ���ΰ� ���ü��','�̺��� ����','������');

insert into book_kyobo value('��ȸ����','�ָ��̵� ���� �д� ģ���� �ֽ�å','������ ����','����Ʈ�Ͻ�');

insert into book_kyobo value('��ȸ����','���� ù ���� ����','����ȯ ����','Ʈ����Ʈ�Ͻ�');

insert into book_kyobo value('��ȸ����','����� �� ���� �����','������ ����','����Ʈ�Ͻ�');



// �и��� ���� å ��õ 

delete from book_mily where book_type="����";

select * from book_mily;

show tables;

create table book_mily(
	book_type varchar(50) not null,
	book_title varchar(150) not null,
	book_author varchar(50) not null,
	book_publish varchar(50) not null
);

//����

insert into book_mily value('����','��ť�Ŀ�','����ȫ ����','��º�');

insert into book_mily value('����','���� �ϴܰ����ô�!','�¿��� ����','�Ϸα����۴�');

insert into book_mily value('����','�޷���Ʈ �� ��ȭ��','�̹̿�','���丮����');

insert into book_mily value('����','���Ѻ���','ġ�� ��Ű�� ����','�Ƹ���');

insert into book_mily value('����','����ó��|���� �տ�','��� ��Ų�� ����','�츲���ǻ�');



// �ڿ�����

insert into book_mily value('�ڿ�����','���� �Ӽ� ','���ȣ','����������Ͻ�');

insert into book_mily value('�ڿ�����','�÷��� ������ ��¥ ����','����ȣ ����','�̵�');

insert into book_mily value('�ڿ�����','30�� �¹��� �κ��� 30�� �ε��� ����ũ','ȫ���� ����','���ǳ�');

insert into book_mily value('�ڿ�����','���� �߿�����','������ �帶��','��Ʈ');

insert into book_mily value('�ڿ�����','�κ� �ô� ���ڸ��� �̷�','���̽� ��Ŀ ����','�̵�');




// �ι�����

insert into book_mily value('�ι�����','�޷���Ʈ �� ��ȭ��','�̹̿�','���丮����');

insert into book_mily value('�ι�����','������ ������','��ȣ��','����������');

insert into book_mily value('�ι�����','���� ���� ������ ��','�����ó� ���̰� ����','�˿���ġ�ڸ���');

insert into book_mily value('�ι�����','�� �� ���� ���� ����','�ȵ巹 ��ġ�� ����','�������� ��');

insert into book_mily value('�ι�����','�ʹ� �ѳ��� ����','������ ����','���е���');




//��ȸ����

insert into book_mily value('��ȸ����','��ť�Ŀ�','����ȫ ����','��º�');

insert into book_mily value('��ȸ����','���� �ϴܰ����ô�!','�¿��� ����','�Ϸα����۴�');

insert into book_mily value('��ȸ����','�޷���Ʈ �� ��ȭ��','�̹̿�','���丮����');

insert into book_mily value('��ȸ����','���Ѻ���','ġ�� ��Ű�� ����','�Ƹ���');

insert into book_mily value('��ȸ����','����ó��|���� �տ�','��� ��Ų�� ����','�츲���ǻ�');



