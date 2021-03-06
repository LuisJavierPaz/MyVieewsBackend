PGDMP         	                 x            MyVieews #   12.5 (Ubuntu 12.5-0ubuntu0.20.04.1) #   12.5 (Ubuntu 12.5-0ubuntu0.20.04.1) 7    �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    25153    MyVieews    DATABASE     |   CREATE DATABASE "MyVieews" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'es_EC.UTF-8' LC_CTYPE = 'es_EC.UTF-8';
    DROP DATABASE "MyVieews";
                postgres    false                        3079    25154 	   uuid-ossp 	   EXTENSION     ?   CREATE EXTENSION IF NOT EXISTS "uuid-ossp" WITH SCHEMA public;
    DROP EXTENSION "uuid-ossp";
                   false            �           0    0    EXTENSION "uuid-ossp"    COMMENT     W   COMMENT ON EXTENSION "uuid-ossp" IS 'generate universally unique identifiers (UUIDs)';
                        false    2            �            1259    25187    canal    TABLE     �  CREATE TABLE public.canal (
    id_canal integer NOT NULL,
    external_id_canal uuid DEFAULT public.uuid_generate_v4(),
    foto_perfil bytea,
    foto_portada bytea,
    nombre_canal character varying(20) NOT NULL,
    fecha_creacion date DEFAULT CURRENT_DATE,
    descripcion text DEFAULT 'SIN DESCRIPCION'::text,
    strike integer DEFAULT 0,
    reportes integer DEFAULT 0,
    fk_id_persona integer NOT NULL
);
    DROP TABLE public.canal;
       public         heap    postgres    false    2            �            1259    25185    canal_id_canal_seq    SEQUENCE     �   CREATE SEQUENCE public.canal_id_canal_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE public.canal_id_canal_seq;
       public          postgres    false    210            �           0    0    canal_id_canal_seq    SEQUENCE OWNED BY     I   ALTER SEQUENCE public.canal_id_canal_seq OWNED BY public.canal.id_canal;
          public          postgres    false    209            �            1259    25225 	   categoria    TABLE     �   CREATE TABLE public.categoria (
    id_categoria integer NOT NULL,
    external_id_categoria uuid DEFAULT public.uuid_generate_v4(),
    external_canal uuid,
    nombre_categoria character varying(30) NOT NULL
);
    DROP TABLE public.categoria;
       public         heap    postgres    false    2            �            1259    25223    categoria_id_categoria_seq    SEQUENCE     �   CREATE SEQUENCE public.categoria_id_categoria_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 1   DROP SEQUENCE public.categoria_id_categoria_seq;
       public          postgres    false    214            �           0    0    categoria_id_categoria_seq    SEQUENCE OWNED BY     Y   ALTER SEQUENCE public.categoria_id_categoria_seq OWNED BY public.categoria.id_categoria;
          public          postgres    false    213            �            1259    25234    cuenta    TABLE     $  CREATE TABLE public.cuenta (
    id_cuenta integer NOT NULL,
    external_id_cuenta uuid DEFAULT public.uuid_generate_v4(),
    correo_electronico character varying(30) NOT NULL,
    clave character varying(15) NOT NULL,
    estado boolean DEFAULT true,
    fk_id_persona integer NOT NULL
);
    DROP TABLE public.cuenta;
       public         heap    postgres    false    2            �            1259    25232    cuenta_id_cuenta_seq    SEQUENCE     �   CREATE SEQUENCE public.cuenta_id_cuenta_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 +   DROP SEQUENCE public.cuenta_id_cuenta_seq;
       public          postgres    false    216            �           0    0    cuenta_id_cuenta_seq    SEQUENCE OWNED BY     M   ALTER SEQUENCE public.cuenta_id_cuenta_seq OWNED BY public.cuenta.id_cuenta;
          public          postgres    false    215            �            1259    25177    persona    TABLE     �  CREATE TABLE public.persona (
    id_persona integer NOT NULL,
    external_id_persona uuid DEFAULT public.uuid_generate_v4(),
    nombre character varying(30) NOT NULL,
    apellido character varying(30) NOT NULL,
    fecha_nacimiento date NOT NULL,
    genero character varying(30) NOT NULL,
    telefono character varying(15) DEFAULT '00000000000000'::character varying NOT NULL,
    fk_id_rol integer NOT NULL
);
    DROP TABLE public.persona;
       public         heap    postgres    false    2            �            1259    25175    persona_id_persona_seq    SEQUENCE     �   CREATE SEQUENCE public.persona_id_persona_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 -   DROP SEQUENCE public.persona_id_persona_seq;
       public          postgres    false    208            �           0    0    persona_id_persona_seq    SEQUENCE OWNED BY     Q   ALTER SEQUENCE public.persona_id_persona_seq OWNED BY public.persona.id_persona;
          public          postgres    false    207            �            1259    25167    rol    TABLE     b   CREATE TABLE public.rol (
    id_rol integer NOT NULL,
    tipo character varying(15) NOT NULL
);
    DROP TABLE public.rol;
       public         heap    postgres    false            �            1259    25165    rol_id_rol_seq    SEQUENCE     �   CREATE SEQUENCE public.rol_id_rol_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE public.rol_id_rol_seq;
       public          postgres    false    206                        0    0    rol_id_rol_seq    SEQUENCE OWNED BY     A   ALTER SEQUENCE public.rol_id_rol_seq OWNED BY public.rol.id_rol;
          public          postgres    false    205            �            1259    25205    video    TABLE     �  CREATE TABLE public.video (
    id_video integer NOT NULL,
    external_id_video uuid DEFAULT public.uuid_generate_v4(),
    ref_external_id_canal uuid,
    nombre character varying(25) NOT NULL,
    descripcion text DEFAULT 'SIN DESCRICION'::text NOT NULL,
    fecha_publicacion date DEFAULT CURRENT_DATE,
    directorio text DEFAULT 'SIN DIRECTORIO'::text,
    visualisaciones bigint DEFAULT 0,
    gustar bigint DEFAULT 0,
    no_gustar bigint DEFAULT 0,
    visibilidad character varying(15) DEFAULT 'DISPONIBLE'::character varying,
    estado_video character varying(15) DEFAULT 'ACTIVO'::character varying,
    fk_id_canal integer NOT NULL,
    fk_id_categoria integer NOT NULL
);
    DROP TABLE public.video;
       public         heap    postgres    false    2            �            1259    25203    video_id_video_seq    SEQUENCE     �   CREATE SEQUENCE public.video_id_video_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE public.video_id_video_seq;
       public          postgres    false    212                       0    0    video_id_video_seq    SEQUENCE OWNED BY     I   ALTER SEQUENCE public.video_id_video_seq OWNED BY public.video.id_video;
          public          postgres    false    211            A           2604    25190    canal id_canal    DEFAULT     p   ALTER TABLE ONLY public.canal ALTER COLUMN id_canal SET DEFAULT nextval('public.canal_id_canal_seq'::regclass);
 =   ALTER TABLE public.canal ALTER COLUMN id_canal DROP DEFAULT;
       public          postgres    false    209    210    210            Q           2604    25228    categoria id_categoria    DEFAULT     �   ALTER TABLE ONLY public.categoria ALTER COLUMN id_categoria SET DEFAULT nextval('public.categoria_id_categoria_seq'::regclass);
 E   ALTER TABLE public.categoria ALTER COLUMN id_categoria DROP DEFAULT;
       public          postgres    false    214    213    214            S           2604    25237    cuenta id_cuenta    DEFAULT     t   ALTER TABLE ONLY public.cuenta ALTER COLUMN id_cuenta SET DEFAULT nextval('public.cuenta_id_cuenta_seq'::regclass);
 ?   ALTER TABLE public.cuenta ALTER COLUMN id_cuenta DROP DEFAULT;
       public          postgres    false    215    216    216            >           2604    25180    persona id_persona    DEFAULT     x   ALTER TABLE ONLY public.persona ALTER COLUMN id_persona SET DEFAULT nextval('public.persona_id_persona_seq'::regclass);
 A   ALTER TABLE public.persona ALTER COLUMN id_persona DROP DEFAULT;
       public          postgres    false    208    207    208            =           2604    25170 
   rol id_rol    DEFAULT     h   ALTER TABLE ONLY public.rol ALTER COLUMN id_rol SET DEFAULT nextval('public.rol_id_rol_seq'::regclass);
 9   ALTER TABLE public.rol ALTER COLUMN id_rol DROP DEFAULT;
       public          postgres    false    205    206    206            G           2604    25208    video id_video    DEFAULT     p   ALTER TABLE ONLY public.video ALTER COLUMN id_video SET DEFAULT nextval('public.video_id_video_seq'::regclass);
 =   ALTER TABLE public.video ALTER COLUMN id_video DROP DEFAULT;
       public          postgres    false    212    211    212            �          0    25187    canal 
   TABLE DATA           �   COPY public.canal (id_canal, external_id_canal, foto_perfil, foto_portada, nombre_canal, fecha_creacion, descripcion, strike, reportes, fk_id_persona) FROM stdin;
    public          postgres    false    210   �B       �          0    25225 	   categoria 
   TABLE DATA           j   COPY public.categoria (id_categoria, external_id_categoria, external_canal, nombre_categoria) FROM stdin;
    public          postgres    false    214   �B       �          0    25234    cuenta 
   TABLE DATA           q   COPY public.cuenta (id_cuenta, external_id_cuenta, correo_electronico, clave, estado, fk_id_persona) FROM stdin;
    public          postgres    false    216   �B       �          0    25177    persona 
   TABLE DATA           �   COPY public.persona (id_persona, external_id_persona, nombre, apellido, fecha_nacimiento, genero, telefono, fk_id_rol) FROM stdin;
    public          postgres    false    208   �B       �          0    25167    rol 
   TABLE DATA           +   COPY public.rol (id_rol, tipo) FROM stdin;
    public          postgres    false    206   C       �          0    25205    video 
   TABLE DATA           �   COPY public.video (id_video, external_id_video, ref_external_id_canal, nombre, descripcion, fecha_publicacion, directorio, visualisaciones, gustar, no_gustar, visibilidad, estado_video, fk_id_canal, fk_id_categoria) FROM stdin;
    public          postgres    false    212   .C                  0    0    canal_id_canal_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('public.canal_id_canal_seq', 1, false);
          public          postgres    false    209                       0    0    categoria_id_categoria_seq    SEQUENCE SET     I   SELECT pg_catalog.setval('public.categoria_id_categoria_seq', 1, false);
          public          postgres    false    213                       0    0    cuenta_id_cuenta_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('public.cuenta_id_cuenta_seq', 1, false);
          public          postgres    false    215                       0    0    persona_id_persona_seq    SEQUENCE SET     E   SELECT pg_catalog.setval('public.persona_id_persona_seq', 1, false);
          public          postgres    false    207                       0    0    rol_id_rol_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('public.rol_id_rol_seq', 1, false);
          public          postgres    false    205                       0    0    video_id_video_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('public.video_id_video_seq', 1, false);
          public          postgres    false    211            ]           2606    25202    canal canal_fk_id_persona_key 
   CONSTRAINT     a   ALTER TABLE ONLY public.canal
    ADD CONSTRAINT canal_fk_id_persona_key UNIQUE (fk_id_persona);
 G   ALTER TABLE ONLY public.canal DROP CONSTRAINT canal_fk_id_persona_key;
       public            postgres    false    210            _           2606    25200    canal canal_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.canal
    ADD CONSTRAINT canal_pkey PRIMARY KEY (id_canal);
 :   ALTER TABLE ONLY public.canal DROP CONSTRAINT canal_pkey;
       public            postgres    false    210            c           2606    25231    categoria categoria_pkey 
   CONSTRAINT     `   ALTER TABLE ONLY public.categoria
    ADD CONSTRAINT categoria_pkey PRIMARY KEY (id_categoria);
 B   ALTER TABLE ONLY public.categoria DROP CONSTRAINT categoria_pkey;
       public            postgres    false    214            e           2606    25241    cuenta cuenta_pkey 
   CONSTRAINT     W   ALTER TABLE ONLY public.cuenta
    ADD CONSTRAINT cuenta_pkey PRIMARY KEY (id_cuenta);
 <   ALTER TABLE ONLY public.cuenta DROP CONSTRAINT cuenta_pkey;
       public            postgres    false    216            [           2606    25184    persona persona_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.persona
    ADD CONSTRAINT persona_pkey PRIMARY KEY (id_persona);
 >   ALTER TABLE ONLY public.persona DROP CONSTRAINT persona_pkey;
       public            postgres    false    208            W           2606    25172    rol rol_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.rol
    ADD CONSTRAINT rol_pkey PRIMARY KEY (id_rol);
 6   ALTER TABLE ONLY public.rol DROP CONSTRAINT rol_pkey;
       public            postgres    false    206            Y           2606    25174    rol rol_tipo_key 
   CONSTRAINT     K   ALTER TABLE ONLY public.rol
    ADD CONSTRAINT rol_tipo_key UNIQUE (tipo);
 :   ALTER TABLE ONLY public.rol DROP CONSTRAINT rol_tipo_key;
       public            postgres    false    206            a           2606    25222    video video_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.video
    ADD CONSTRAINT video_pkey PRIMARY KEY (id_video);
 :   ALTER TABLE ONLY public.video DROP CONSTRAINT video_pkey;
       public            postgres    false    212            g           2606    25252    canal fk_canal_persona    FK CONSTRAINT     �   ALTER TABLE ONLY public.canal
    ADD CONSTRAINT fk_canal_persona FOREIGN KEY (fk_id_persona) REFERENCES public.persona(id_persona);
 @   ALTER TABLE ONLY public.canal DROP CONSTRAINT fk_canal_persona;
       public          postgres    false    208    2907    210            j           2606    25242    cuenta fk_cuenta_persona    FK CONSTRAINT     �   ALTER TABLE ONLY public.cuenta
    ADD CONSTRAINT fk_cuenta_persona FOREIGN KEY (fk_id_persona) REFERENCES public.persona(id_persona);
 B   ALTER TABLE ONLY public.cuenta DROP CONSTRAINT fk_cuenta_persona;
       public          postgres    false    208    2907    216            f           2606    25247    persona fk_persona_rol    FK CONSTRAINT     y   ALTER TABLE ONLY public.persona
    ADD CONSTRAINT fk_persona_rol FOREIGN KEY (fk_id_rol) REFERENCES public.rol(id_rol);
 @   ALTER TABLE ONLY public.persona DROP CONSTRAINT fk_persona_rol;
       public          postgres    false    206    2903    208            h           2606    25257    video fk_video_canal    FK CONSTRAINT     }   ALTER TABLE ONLY public.video
    ADD CONSTRAINT fk_video_canal FOREIGN KEY (fk_id_canal) REFERENCES public.canal(id_canal);
 >   ALTER TABLE ONLY public.video DROP CONSTRAINT fk_video_canal;
       public          postgres    false    212    2911    210            i           2606    25262    video fk_video_categoria    FK CONSTRAINT     �   ALTER TABLE ONLY public.video
    ADD CONSTRAINT fk_video_categoria FOREIGN KEY (fk_id_categoria) REFERENCES public.categoria(id_categoria);
 B   ALTER TABLE ONLY public.video DROP CONSTRAINT fk_video_categoria;
       public          postgres    false    2915    214    212            �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �     