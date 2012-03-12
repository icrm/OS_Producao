DELETE FROM `mzlume`.`mz_os_producao_acabamentos`;
DELETE FROM `mzlume`.`mz_os_producao_blocos`;
DELETE FROM `mzlume`.`mz_os_producao_cadernos`;
DELETE FROM `mzlume`.`mz_os_producao_capa_dura`;
DELETE FROM `mzlume`.`mz_os_producao_impressao_miolo`;
DELETE FROM `mzlume`.`mz_os_producao_insercoes`;
DELETE FROM `mzlume`.`mz_os_producao_miolo`;
DELETE FROM `mzlume`.`mz_os_producao_papel`;
DELETE FROM `mzlume`.`mz_os_producao`;

DELETE FROM `mzlume`.`mz_cadernos`;
INSERT INTO `mzlume`.`mz_cadernos` ( `DS_CADERNOS` ) VALUES
( '210 X 280' ),
( '180 X 250' ),
( '200 X 230' ),
( '150 X 210' ),
( 'OUTROS' );

DELETE FROM `mzlume`.`mz_blocos`;
INSERT INTO `mzlume`.`mz_blocos` ( `DS_BLOCOS` ) VALUES
( '150 X 210' ),
( '100 X 150' ),
( 'OUTROS' );

DELETE FROM `mzlume`.`mz_acabamentos`;
INSERT INTO `mzlume`.`mz_acabamentos` ( `DS_ACABAMENTOS` ) VALUES
( 'WIRE-O' ),
( 'ESPIRAL' ),
( 'SILVER' ),
( 'PRETO' ),
( 'BRANCO' ),
( 'OUTROS' );

DELETE FROM `mzlume`.`mz_miolo`;
INSERT INTO `mzlume`.`mz_miolo` ( `DS_MIOLO` ) VALUES
( '96 LAMINAS' ),
( 'OUTROS' );

DELETE FROM `mzlume`.`mz_impressao_miolo`;
INSERT INTO `mzlume`.`mz_impressao_miolo` ( `DS_IMPRESSAO_MIOLO` ) VALUES
( '1 X 0' ),
( '1 X 1' ),
( 'SEM IMPRESSÃO' ),
( 'OUTROS' );

DELETE FROM `mzlume`.`mz_papel`;
INSERT INTO `mzlume`.`mz_papel` ( `DS_PAPEL` ) VALUES
( 'OFF SET 70g' ),
( 'RECICLATO 70g' ),
( 'OUTROS' );

DELETE FROM `mzlume`.`mz_capa_dura`;
INSERT INTO `mzlume`.`mz_capa_dura` ( `DS_CAPA_DURA` ) VALUES
( 'DURA 4 X 0' ),
( 'TRIPLEX' ),
( 'PLÁSTICO BRILHO' ),
( 'PLÁSTICO FOSCO' ),
( 'VERNIZ UV COM RESERVA' ),
( 'VERNIZ UV TOTAL' );

DELETE FROM `mzlume`.`mz_insercoes`;
INSERT INTO `mzlume`.`mz_insercoes` ( `DS_INSERCOES` ) VALUES
( 'PLAN. ANUAL 6 L' ),
( 'PLAN. ANUAL 3 L' ),
( 'BOLSA DE PVC' ),
( 'ÍNDICE TEL' ),
( 'INSTITUCIONAL' ),
( 'OUTROS' );
