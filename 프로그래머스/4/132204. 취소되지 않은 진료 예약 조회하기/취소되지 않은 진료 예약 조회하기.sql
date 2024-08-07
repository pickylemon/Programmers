-- 코드를 입력하세요
SELECT APNT_NO, PT_NAME, a.PT_NO, b.MCDP_CD, DR_NAME, APNT_YMD
FROM PATIENT a
INNER JOIN APPOINTMENT c
ON a.PT_NO = c.PT_NO
INNER JOIN DOCTOR b
ON b.DR_ID = c.MDDR_ID
AND b.MCDP_CD = c.MCDP_CD
WHERE b.MCDP_CD = 'CS'
AND APNT_CNCL_YN = 'N'
AND DATE_FORMAT(APNT_YMD,'%Y-%m-%d') = '2022-04-13'
ORDER BY APNT_YMD;