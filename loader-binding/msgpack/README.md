MessagePack���ö�ȡ
======

> ���ڶ�ȡ�������Ϊmsgpack��ת�����

����[MessagePack](http://msgpack.org/) ֧�ֵ����Ժܶ࣬���ҽӿڲ�ͳһ�����Բ��ṩ��ȡ�⡣���д�������������������ʽ��

```
{
    xrex_ver: "�汾���ַ���",
	data_ver: "�汾���ַ���",
	xrex_ver: ���ü�¼����,
	hash_code: "hash�㷨:hashֵ",
}
����Э����: [
    {��������},
	{��������},
	{��������},
]
```


��sample��python�汾���ݶ�ȡ��ӡʾ����
```python
#!/usr/bin/python
# -*- coding: utf-8 -*-

import msgpack

unpacker = msgpack.Unpacker(open('role_cfg.msgpack.bin'))

for unpacked in unpacker:
    print(unpacked)

```
